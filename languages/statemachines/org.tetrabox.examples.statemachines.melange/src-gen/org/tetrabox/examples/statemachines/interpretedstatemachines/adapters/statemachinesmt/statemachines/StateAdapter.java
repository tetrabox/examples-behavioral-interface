package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.State;
import statemachines.Behavior;
import statemachines.Pseudostate;
import statemachines.Region;
import statemachines.Transition;
import statemachines.Trigger;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements statemachines.State {
  private StateMachinesMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.StateMachinesMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  private EList<Transition> outgoingTransitions_;
  
  @Override
  public EList<Transition> getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
  }
  
  private EList<Transition> incomingTransitions_;
  
  @Override
  public EList<Transition> getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  private EList<Region> regions_;
  
  @Override
  public EList<Region> getRegions() {
    if (regions_ == null)
    	regions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegions(), adaptersFactory, eResource);
    return regions_;
  }
  
  @Override
  public Behavior getEntry() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getEntry(), eResource);
  }
  
  @Override
  public void setEntry(final Behavior o) {
    if (o != null)
    	adaptee.setEntry(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public Behavior getDoActivity() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getDoActivity(), eResource);
  }
  
  @Override
  public void setDoActivity(final Behavior o) {
    if (o != null)
    	adaptee.setDoActivity(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setDoActivity(null);
  }
  
  @Override
  public Behavior getExit() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final Behavior o) {
    if (o != null)
    	adaptee.setExit(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.statemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  private EList<Trigger> deferrableTriggers_;
  
  @Override
  public EList<Trigger> getDeferrableTriggers() {
    if (deferrableTriggers_ == null)
    	deferrableTriggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeferrableTriggers(), adaptersFactory, eResource);
    return deferrableTriggers_;
  }
  
  private EList<Pseudostate> connectionPoint_;
  
  @Override
  public EList<Pseudostate> getConnectionPoint() {
    if (connectionPoint_ == null)
    	connectionPoint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectionPoint(), adaptersFactory, eResource);
    return connectionPoint_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return statemachines.StatemachinesPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STATE__NAME:
    		return getName();
    	case statemachines.StatemachinesPackage.STATE__CONTAINER:
    		return getContainer();
    	case statemachines.StatemachinesPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case statemachines.StatemachinesPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case statemachines.StatemachinesPackage.STATE__REGIONS:
    		return getRegions();
    	case statemachines.StatemachinesPackage.STATE__ENTRY:
    		return getEntry();
    	case statemachines.StatemachinesPackage.STATE__DO_ACTIVITY:
    		return getDoActivity();
    	case statemachines.StatemachinesPackage.STATE__EXIT:
    		return getExit();
    	case statemachines.StatemachinesPackage.STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers();
    	case statemachines.StatemachinesPackage.STATE__CONNECTION_POINT:
    		return getConnectionPoint();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case statemachines.StatemachinesPackage.STATE__CONTAINER:
    		return getContainer() != null;
    	case statemachines.StatemachinesPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case statemachines.StatemachinesPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case statemachines.StatemachinesPackage.STATE__REGIONS:
    		return getRegions() != null && !getRegions().isEmpty();
    	case statemachines.StatemachinesPackage.STATE__ENTRY:
    		return getEntry() != null;
    	case statemachines.StatemachinesPackage.STATE__DO_ACTIVITY:
    		return getDoActivity() != null;
    	case statemachines.StatemachinesPackage.STATE__EXIT:
    		return getExit() != null;
    	case statemachines.StatemachinesPackage.STATE__DEFERRABLE_TRIGGERS:
    		return getDeferrableTriggers() != null && !getDeferrableTriggers().isEmpty();
    	case statemachines.StatemachinesPackage.STATE__CONNECTION_POINT:
    		return getConnectionPoint() != null && !getConnectionPoint().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case statemachines.StatemachinesPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__CONTAINER:
    		setContainer(
    		(statemachines.Region)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__REGIONS:
    		getRegions().clear();
    		getRegions().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__ENTRY:
    		setEntry(
    		(statemachines.Behavior)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__DO_ACTIVITY:
    		setDoActivity(
    		(statemachines.Behavior)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__EXIT:
    		setExit(
    		(statemachines.Behavior)
    		 newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__DEFERRABLE_TRIGGERS:
    		getDeferrableTriggers().clear();
    		getDeferrableTriggers().addAll((Collection) newValue);
    		return;
    	case statemachines.StatemachinesPackage.STATE__CONNECTION_POINT:
    		getConnectionPoint().clear();
    		getConnectionPoint().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
