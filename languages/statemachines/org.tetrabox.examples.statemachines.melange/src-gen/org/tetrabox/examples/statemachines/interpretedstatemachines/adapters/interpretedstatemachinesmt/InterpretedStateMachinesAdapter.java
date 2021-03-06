package org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.tetrabox.examples.statemachines.InterpretedStateMachinesMT;
import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.StatemachinesFactory;

@SuppressWarnings("all")
public class InterpretedStateMachinesAdapter extends ResourceAdapter implements InterpretedStateMachinesMT {
  public InterpretedStateMachinesAdapter() {
    super(org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.InterpretedStateMachinesMTAdaptersFactory.getInstance());
  }
  
  @Override
  public StatemachinesFactory getStatemachinesFactory() {
    return new org.tetrabox.examples.statemachines.interpretedstatemachines.adapters.interpretedstatemachinesmt.statemachines.StatemachinesFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getStatemachinesFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
