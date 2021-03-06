package org.tetrabox.examples.statemachines.interpretedstatemachines.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.RegionAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateMachineAspect;
import org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public class VertexAspect {
  protected static void enter(final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.FinalStateAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.enter((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_enter(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void exit(final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.exit((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.exit((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence,Region)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_exit(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void terminate(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void terminate() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.terminate((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#void terminate() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_terminate(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self);
    };
  }
  
  protected static boolean isActive(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isActive() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.isActive((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isActive() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isActive(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean isEnterable(final Vertex _self, final Transition enteringTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isEnterable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,enteringTransition);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isEnterable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isEnterable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.isEnterable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self,enteringTransition);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isEnterable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    // #DispatchPointCut_before# boolean isEnterable(Transition)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isEnterable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,enteringTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean isExitable(final Vertex _self, final Transition exitingTransition) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isExitable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self,exitingTransition);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isExitable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isExitable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.isExitable((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,exitingTransition);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean isExitable(Transition) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    // #DispatchPointCut_before# boolean isExitable(Transition)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_isExitable(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,exitingTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean contains(final Vertex _self, final Vertex vertex) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean contains(Vertex) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect.contains((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)_self,vertex);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#boolean contains(Vertex) from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.StateAspect
    // #DispatchPointCut_before# boolean contains(Vertex)
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_contains(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self,vertex);
    };
    return (boolean)result;
  }
  
  protected static Region getContainingRegion(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#Region getContainingRegion() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.getContainingRegion((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#Region getContainingRegion() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    // #DispatchPointCut_before# Region getContainingRegion()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_getContainingRegion(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self);
    };
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Region)result;
  }
  
  protected static State getParentState(final Vertex _self) {
    final org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectProperties _self_ = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#State getParentState() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    		if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate){
    			result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect.getParentState((org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect#State getParentState() from org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.PseudostateAspect
    // #DispatchPointCut_before# State getParentState()
    if (_self instanceof org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex){
    	result = org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.VertexAspect._privk3_getParentState(_self_, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Vertex)_self);
    };
    return (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State)result;
  }
  
  protected static void _privk3_enter(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(_self.getContainer(), leastCommonAncestor)))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.enter(containingState, enteringTransition, eventOccurrence, leastCommonAncestor);
      }
    }
    Region _containingRegion = VertexAspect.getContainingRegion(_self);
    RegionAspect.currentVertex(_containingRegion, _self);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(VertexAspect.getContainingRegion(_self))).add(_self);
  }
  
  protected static void _privk3_exit(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _containingRegion = VertexAspect.getContainingRegion(_self);
    RegionAspect.currentVertex(_containingRegion, null);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(VertexAspect.getContainingRegion(_self))).remove(_self);
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(leastCommonAncestor, _self.getContainer())))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.exit(containingState, exitingTransition, eventOccurrence, leastCommonAncestor);
      }
    }
  }
  
  protected static void _privk3_terminate(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return;
  }
  
  protected static boolean _privk3_isActive(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).contains(_self);
  }
  
  protected static boolean _privk3_isEnterable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition) {
    return true;
  }
  
  protected static boolean _privk3_isExitable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition) {
    return true;
  }
  
  protected static boolean _privk3_contains(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Vertex vertex) {
    return false;
  }
  
  protected static Region _privk3_getContainingRegion(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return _self.getContainer();
  }
  
  protected static State _privk3_getParentState(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return _self.getContainer().getState();
  }
}
