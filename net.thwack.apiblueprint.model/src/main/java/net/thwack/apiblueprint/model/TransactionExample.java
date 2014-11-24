/**
 */
package net.thwack.apiblueprint.model;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Transaction Example</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.apiblueprint.model.TransactionExample#getResponses <em>
 * Responses</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.TransactionExample#getRequests <em>
 * Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getTransactionExample()
 * @model kind="class"
 * @generated
 */
public class TransactionExample extends Base {
	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> responses;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransactionExample() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.TRANSACTION_EXAMPLE;
	}

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.Response}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getTransactionExample_Responses()
	 * @model containment="true"
	 * @generated
	 */
	public List<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectContainmentEList<Response>(Response.class,
					this,
					APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES);
		}
		return responses;
	}

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.Request}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getTransactionExample_Requests()
	 * @model containment="true"
	 * @generated
	 */
	public List<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<Request>(Request.class,
					this,
					APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES:
			return ((InternalEList<?>) getResponses()).basicRemove(otherEnd,
					msgs);
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS:
			return ((InternalEList<?>) getRequests()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES:
			return getResponses();
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS:
			return getRequests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES:
			getResponses().clear();
			getResponses().addAll((Collection<? extends Response>) newValue);
			return;
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS:
			getRequests().clear();
			getRequests().addAll((Collection<? extends Request>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES:
			getResponses().clear();
			return;
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS:
			getRequests().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__RESPONSES:
			return responses != null && !responses.isEmpty();
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE__REQUESTS:
			return requests != null && !requests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TransactionExample
