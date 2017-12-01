/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.Precondition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(WebDriverActionCondition)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getPrecondition_Action()
   * @model containment="true"
   * @generated
   */
  WebDriverActionCondition getAction();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.Precondition#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(WebDriverActionCondition value);

} // Precondition