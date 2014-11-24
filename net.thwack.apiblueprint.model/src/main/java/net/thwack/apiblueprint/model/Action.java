/**
 */
package net.thwack.apiblueprint.model;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Action</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.apiblueprint.model.Action#getHeaders <em>Headers</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Action#getMethod <em>Method</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Action#getParameters <em>Parameters
 * </em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Action#getExamples <em>Examples
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAction()
 * @model kind="class"
 * @generated
 */
public class Action extends Base {
	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValueType> headers;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionExample> examples;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Action() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.ACTION;
	}

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.NameValueType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAction_Headers()
	 * @model containment="true"
	 * @generated
	 */
	public List<NameValueType> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<NameValueType>(
					NameValueType.class, this,
					APIBlueprintModelPackage.ACTION__HEADERS);
		}
		return headers;
	}

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAction_Method()
	 * @model
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Action#getMethod <em>Method</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.ACTION__METHOD, oldMethod, method));
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.Parameter}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference
	 *         list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	public List<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(
					Parameter.class, this,
					APIBlueprintModelPackage.ACTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.TransactionExample}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAction_Examples()
	 * @model containment="true"
	 * @generated
	 */
	public List<TransactionExample> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<TransactionExample>(
					TransactionExample.class, this,
					APIBlueprintModelPackage.ACTION__EXAMPLES);
		}
		return examples;
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
		case APIBlueprintModelPackage.ACTION__HEADERS:
			return ((InternalEList<?>) getHeaders())
					.basicRemove(otherEnd, msgs);
		case APIBlueprintModelPackage.ACTION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
		case APIBlueprintModelPackage.ACTION__EXAMPLES:
			return ((InternalEList<?>) getExamples()).basicRemove(otherEnd,
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
		case APIBlueprintModelPackage.ACTION__HEADERS:
			return getHeaders();
		case APIBlueprintModelPackage.ACTION__METHOD:
			return getMethod();
		case APIBlueprintModelPackage.ACTION__PARAMETERS:
			return getParameters();
		case APIBlueprintModelPackage.ACTION__EXAMPLES:
			return getExamples();
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
		case APIBlueprintModelPackage.ACTION__HEADERS:
			getHeaders().clear();
			getHeaders().addAll((Collection<? extends NameValueType>) newValue);
			return;
		case APIBlueprintModelPackage.ACTION__METHOD:
			setMethod((String) newValue);
			return;
		case APIBlueprintModelPackage.ACTION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case APIBlueprintModelPackage.ACTION__EXAMPLES:
			getExamples().clear();
			getExamples().addAll(
					(Collection<? extends TransactionExample>) newValue);
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
		case APIBlueprintModelPackage.ACTION__HEADERS:
			getHeaders().clear();
			return;
		case APIBlueprintModelPackage.ACTION__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case APIBlueprintModelPackage.ACTION__PARAMETERS:
			getParameters().clear();
			return;
		case APIBlueprintModelPackage.ACTION__EXAMPLES:
			getExamples().clear();
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
		case APIBlueprintModelPackage.ACTION__HEADERS:
			return headers != null && !headers.isEmpty();
		case APIBlueprintModelPackage.ACTION__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT
					.equals(method);
		case APIBlueprintModelPackage.ACTION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case APIBlueprintModelPackage.ACTION__EXAMPLES:
			return examples != null && !examples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} // Action
