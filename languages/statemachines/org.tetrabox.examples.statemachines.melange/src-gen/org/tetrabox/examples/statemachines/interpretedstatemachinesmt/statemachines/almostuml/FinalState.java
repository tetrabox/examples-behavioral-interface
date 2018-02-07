/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml;

import org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.EventOccurrence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.tetrabox.examples.statemachines.interpretedstatemachinesmt.statemachines.almostuml.AlmostumlPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends State {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enter(Transition enteringTransition, EventOccurrence eventOccurrence, Region leastCommonAncestor);

} // FinalState
