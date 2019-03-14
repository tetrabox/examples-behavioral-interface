/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.util.StatemachinesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinesItemProviderAdapterFactory extends StatemachinesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachinesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomSystemItemProvider customSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomSystemAdapter() {
		if (customSystemItemProvider == null) {
			customSystemItemProvider = new CustomSystemItemProvider(this);
		}

		return customSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEventTypeItemProvider signalEventTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalEventTypeAdapter() {
		if (signalEventTypeItemProvider == null) {
			signalEventTypeItemProvider = new SignalEventTypeItemProvider(this);
		}

		return signalEventTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallEventTypeItemProvider callEventTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallEventTypeAdapter() {
		if (callEventTypeItemProvider == null) {
			callEventTypeItemProvider = new CallEventTypeItemProvider(this);
		}

		return callEventTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAttributeItemProvider booleanAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAttributeAdapter() {
		if (booleanAttributeItemProvider == null) {
			booleanAttributeItemProvider = new BooleanAttributeItemProvider(this);
		}

		return booleanAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerAttributeItemProvider integerAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAttributeAdapter() {
		if (integerAttributeItemProvider == null) {
			integerAttributeItemProvider = new IntegerAttributeItemProvider(this);
		}

		return integerAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringAttributeItemProvider stringAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAttributeAdapter() {
		if (stringAttributeItemProvider == null) {
			stringAttributeItemProvider = new StringAttributeItemProvider(this);
		}

		return stringAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConstraintItemProvider booleanConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanConstraintAdapter() {
		if (booleanConstraintItemProvider == null) {
			booleanConstraintItemProvider = new BooleanConstraintItemProvider(this);
		}

		return booleanConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerConstraintItemProvider integerConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerConstraintAdapter() {
		if (integerConstraintItemProvider == null) {
			integerConstraintItemProvider = new IntegerConstraintItemProvider(this);
		}

		return integerConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConstraintItemProvider stringConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringConstraintAdapter() {
		if (stringConstraintItemProvider == null) {
			stringConstraintItemProvider = new StringConstraintItemProvider(this);
		}

		return stringConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineItemProvider stateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineAdapter() {
		if (stateMachineItemProvider == null) {
			stateMachineItemProvider = new StateMachineItemProvider(this);
		}

		return stateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionItemProvider regionItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionAdapter() {
		if (regionItemProvider == null) {
			regionItemProvider = new RegionItemProvider(this);
		}

		return regionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexItemProvider vertexItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVertexAdapter() {
		if (vertexItemProvider == null) {
			vertexItemProvider = new VertexItemProvider(this);
		}

		return vertexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateItemProvider pseudostateItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPseudostateAdapter() {
		if (pseudostateItemProvider == null) {
			pseudostateItemProvider = new PseudostateItemProvider(this);
		}

		return pseudostateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateItemProvider finalStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalStateAdapter() {
		if (finalStateItemProvider == null) {
			finalStateItemProvider = new FinalStateItemProvider(this);
		}

		return finalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorItemProvider behaviorItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorAdapter() {
		if (behaviorItemProvider == null) {
			behaviorItemProvider = new BehaviorItemProvider(this);
		}

		return behaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBehaviorItemProvider operationBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.OperationBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationBehaviorAdapter() {
		if (operationBehaviorItemProvider == null) {
			operationBehaviorItemProvider = new OperationBehaviorItemProvider(this);
		}

		return operationBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAttributeValueItemProvider booleanAttributeValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.BooleanAttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAttributeValueAdapter() {
		if (booleanAttributeValueItemProvider == null) {
			booleanAttributeValueItemProvider = new BooleanAttributeValueItemProvider(this);
		}

		return booleanAttributeValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerAttributeValueItemProvider integerAttributeValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.IntegerAttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAttributeValueAdapter() {
		if (integerAttributeValueItemProvider == null) {
			integerAttributeValueItemProvider = new IntegerAttributeValueItemProvider(this);
		}

		return integerAttributeValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringAttributeValueItemProvider stringAttributeValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StringAttributeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAttributeValueAdapter() {
		if (stringAttributeValueItemProvider == null) {
			stringAttributeValueItemProvider = new StringAttributeValueItemProvider(this);
		}

		return stringAttributeValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOccurrenceItemProvider eventOccurrenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventOccurrenceAdapter() {
		if (eventOccurrenceItemProvider == null) {
			eventOccurrenceItemProvider = new EventOccurrenceItemProvider(this);
		}

		return eventOccurrenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletionEventOccurrenceItemProvider completionEventOccurrenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CompletionEventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompletionEventOccurrenceAdapter() {
		if (completionEventOccurrenceItemProvider == null) {
			completionEventOccurrenceItemProvider = new CompletionEventOccurrenceItemProvider(this);
		}

		return completionEventOccurrenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEventOccurrenceItemProvider signalEventOccurrenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.SignalEventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalEventOccurrenceAdapter() {
		if (signalEventOccurrenceItemProvider == null) {
			signalEventOccurrenceItemProvider = new SignalEventOccurrenceItemProvider(this);
		}

		return signalEventOccurrenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallEventOccurrenceItemProvider callEventOccurrenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CallEventOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallEventOccurrenceAdapter() {
		if (callEventOccurrenceItemProvider == null) {
			callEventOccurrenceItemProvider = new CallEventOccurrenceItemProvider(this);
		}

		return callEventOccurrenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (customSystemItemProvider != null) customSystemItemProvider.dispose();
		if (signalItemProvider != null) signalItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (signalEventTypeItemProvider != null) signalEventTypeItemProvider.dispose();
		if (callEventTypeItemProvider != null) callEventTypeItemProvider.dispose();
		if (booleanAttributeItemProvider != null) booleanAttributeItemProvider.dispose();
		if (integerAttributeItemProvider != null) integerAttributeItemProvider.dispose();
		if (stringAttributeItemProvider != null) stringAttributeItemProvider.dispose();
		if (booleanConstraintItemProvider != null) booleanConstraintItemProvider.dispose();
		if (integerConstraintItemProvider != null) integerConstraintItemProvider.dispose();
		if (stringConstraintItemProvider != null) stringConstraintItemProvider.dispose();
		if (stateMachineItemProvider != null) stateMachineItemProvider.dispose();
		if (regionItemProvider != null) regionItemProvider.dispose();
		if (vertexItemProvider != null) vertexItemProvider.dispose();
		if (pseudostateItemProvider != null) pseudostateItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (finalStateItemProvider != null) finalStateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (behaviorItemProvider != null) behaviorItemProvider.dispose();
		if (operationBehaviorItemProvider != null) operationBehaviorItemProvider.dispose();
		if (booleanAttributeValueItemProvider != null) booleanAttributeValueItemProvider.dispose();
		if (integerAttributeValueItemProvider != null) integerAttributeValueItemProvider.dispose();
		if (stringAttributeValueItemProvider != null) stringAttributeValueItemProvider.dispose();
		if (eventOccurrenceItemProvider != null) eventOccurrenceItemProvider.dispose();
		if (completionEventOccurrenceItemProvider != null) completionEventOccurrenceItemProvider.dispose();
		if (signalEventOccurrenceItemProvider != null) signalEventOccurrenceItemProvider.dispose();
		if (callEventOccurrenceItemProvider != null) callEventOccurrenceItemProvider.dispose();
	}

}
