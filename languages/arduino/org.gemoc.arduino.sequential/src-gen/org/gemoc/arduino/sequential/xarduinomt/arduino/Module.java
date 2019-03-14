/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Module#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getModule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getModule_Level()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Module#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

} // Module
