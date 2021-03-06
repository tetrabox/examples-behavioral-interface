package org.tetrabox.examples.statemachines.interpretedstatemachines.relationships;

import static org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship.loadBehavioralInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.executionframework.event.manager.EPLSubtypingRelationship;
import org.eclipse.gemoc.executionframework.event.manager.SubtypingRuleSubscriber;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;

import com.google.common.collect.Streams;

public class EPLStateMachineSubtypingRelationship extends EPLSubtypingRelationship {

	private static List<SubtypingRuleSubscriber> computeRuleSubscribers() {
		final List<SubtypingRuleSubscriber> result = new ArrayList<>();
		result.add(new OnStateMachineActivated());
		result.add(new OnSignalActivated());
		result.add(new OnSignalSent());
		return result;
	}

	public EPLStateMachineSubtypingRelationship() {
		this(loadBehavioralInterface("platform:/plugin/org.gemoc.arduino.sequential.xarduino.relationships/Activatable.bi"),
				loadBehavioralInterface("platform:/plugin/org.tetrabox.examples.statemachines.interpretedstatemachines.relationships/InterpretedStateMachines.bi"));
	}

	public EPLStateMachineSubtypingRelationship(BehavioralInterface supertype, BehavioralInterface subtype) {
		super(supertype, subtype, computeRuleSubscribers());
	}

	@Override
	protected boolean isLocal(Class<?> clazz) {
		if (StatemachinesPackage.eINSTANCE.getEClassifiers().stream().map(c -> c.getInstanceClass())
				.anyMatch(c -> Arrays.asList(clazz.getInterfaces()).contains(c))) {
			return true;
		}
		return super.isLocal(clazz);
	}

	static public class OnStateMachineActivated extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('id') from EPLEventOccurrence(event.name='activate')";
		}

		public void update(Object fsmId) {
			final StateMachine stateMachine = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof StateMachine).map(fsm -> (StateMachine) fsm)
					.filter(fsm -> fsm.getName().equals(fsmId))
					.findFirst().orElse(null);
			if (stateMachine != null) {
				final Map<String, Object> parameters = new HashMap<>();
				parameters.put("state_machine", stateMachine);
				consumeEventOccurrence(createAcceptedEventOccurrence("run", parameters));
			}
		}
	}

	static public class OnSignalActivated extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('id') from EPLEventOccurrence(event.name='activate')";
		}

		public void update(Object signalId) {
			final StateMachine stateMachine = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof StateMachine)
					.findFirst().map(fsm -> (StateMachine) fsm).orElse(null);
			final Signal signal = Streams.stream(executedResource.getAllContents())
					.filter(o -> o instanceof Signal).map(s -> (Signal) s)
					.filter(s -> s.getName().equals(signalId))
					.findFirst().orElse(null);
			if (stateMachine != null && signal != null) {
				final Map<String, Object> parameters = new HashMap<>();
				final SignalEventOccurrence signalOccurrence = StatemachinesFactory.eINSTANCE.createSignalEventOccurrence();
				signalOccurrence.setSignal(signal);
				parameters.put("state_machine", stateMachine);
				parameters.put("signal_occurrence", signalOccurrence);
				consumeEventOccurrence(createAcceptedEventOccurrence("signal_received", parameters));
			}
		}
	}

	static public class OnSignalSent extends SubtypingRuleSubscriber {
		@Override
		public String getStatement() {
			return "select args('signal_occurrence') from " +
					"EPLEventOccurrence(event.name='signal_sent')";
		}

		public void update(Object object) {
			if (object != null) {
				final String signalName = ((SignalEventOccurrence) object).getSignal().getName();
				final Map<String, Object> parameters = new HashMap<>();
				parameters.put("id", signalName);
				consumeEventOccurrence(createExposedEventOccurrence("activated", parameters));
			}
		}
	}
}
