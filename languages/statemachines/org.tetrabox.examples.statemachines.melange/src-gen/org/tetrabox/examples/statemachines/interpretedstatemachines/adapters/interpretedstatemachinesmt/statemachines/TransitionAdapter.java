package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Transition;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Constraint;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Trigger;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Transition {
  private InterpretedStateMachinesMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance();
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
  public TransitionKind getKind() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final TransitionKind o) {
    adaptee.setKind(org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.TransitionKind.get(o.getValue()));
  }
  
  @Override
  public Vertex getSource() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Vertex o) {
    if (o != null)
    	adaptee.setSource(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Vertex getTarget() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Vertex o) {
    if (o != null)
    	adaptee.setTarget(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.VertexAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  private EList<Trigger> triggers_;
  
  @Override
  public EList<Trigger> getTriggers() {
    if (triggers_ == null)
    	triggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTriggers(), adaptersFactory, eResource);
    return triggers_;
  }
  
  @Override
  public Region getContainer() {
    return (Region) adaptersFactory.createAdapter(adaptee.getContainer(), eResource);
  }
  
  @Override
  public void setContainer(final Region o) {
    if (o != null)
    	adaptee.setContainer(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.RegionAdapter) o).getAdaptee());
    else adaptee.setContainer(null);
  }
  
  @Override
  public Behavior getEffect() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getEffect(), eResource);
  }
  
  @Override
  public void setEffect(final Behavior o) {
    if (o != null)
    	adaptee.setEffect(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.BehaviorAdapter) o).getAdaptee());
    else adaptee.setEffect(null);
  }
  
  @Override
  public Constraint<?, ?> getConstraint() {
    return (Constraint) adaptersFactory.createAdapter(adaptee.getConstraint(), eResource);
  }
  
  @Override
  public void setConstraint(final Constraint<?, ?> o) {
    if (o != null)
    	adaptee.setConstraint(((org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.ConstraintAdapter) o).getAdaptee());
    else adaptee.setConstraint(null);
  }
  
  @Override
  public void fire(final EventOccurrence eventOccurrence) {
    org.tetrabox.examples.statemachines.interpretedstatemachines.aspects.TransitionAspect.fire(adaptee, (org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence)((EObjectAdapter)eventOccurrence).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static TransitionKind KIND_EDEFAULT = org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind.INTERNAL;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__NAME:
    		return getName();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		return getTriggers();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		return getContainer();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__KIND:
    		return getKind();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		return getEffect();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		return getConstraint();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		return getTriggers() != null && !getTriggers().isEmpty();
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		return getContainer() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		return getEffect() != null;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		return getConstraint() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Vertex)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__TRIGGERS:
    		getTriggers().clear();
    		getTriggers().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONTAINER:
    		setContainer(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Region)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__KIND:
    		setKind(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.TransitionKind)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__EFFECT:
    		setEffect(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Behavior)
    		 newValue);
    		return;
    	case org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesPackage.TRANSITION__CONSTRAINT:
    		setConstraint(
    		(org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.Constraint<?, ?>)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
