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
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.apiblueprint.model.Resource#getUriTemplate <em>Uri
 * Template</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Resource#getParameters <em>
 * Parameters</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Resource#getHeaders <em>Headers
 * </em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Resource#getModel <em>Model</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Resource#getActions <em>Actions
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource()
 * @model kind="class"
 * @generated
 */
public class Resource extends Base {
	/**
	 * The default value of the '{@link #getUriTemplate() <em>Uri Template</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriTemplate() <em>Uri Template</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUriTemplate()
	 * @generated
	 * @ordered
	 */
	protected String uriTemplate = URI_TEMPLATE_EDEFAULT;

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
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValueType> headers;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ResourceModel model;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Resource() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.RESOURCE;
	}

	/**
	 * Returns the value of the '<em><b>Uri Template</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Uri Template</em>' attribute.
	 * @see #setUriTemplate(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource_UriTemplate()
	 * @model
	 * @generated
	 */
	public String getUriTemplate() {
		return uriTemplate;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Resource#getUriTemplate
	 * <em>Uri Template</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Uri Template</em>' attribute.
	 * @see #getUriTemplate()
	 * @generated
	 */
	public void setUriTemplate(String newUriTemplate) {
		String oldUriTemplate = uriTemplate;
		uriTemplate = newUriTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE,
					oldUriTemplate, uriTemplate));
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
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	public List<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(
					Parameter.class, this,
					APIBlueprintModelPackage.RESOURCE__PARAMETERS);
		}
		return parameters;
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
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource_Headers()
	 * @model containment="true"
	 * @generated
	 */
	public List<NameValueType> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<NameValueType>(
					NameValueType.class, this,
					APIBlueprintModelPackage.RESOURCE__HEADERS);
		}
		return headers;
	}

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ResourceModel)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource_Model()
	 * @model containment="true"
	 * @generated
	 */
	public ResourceModel getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetModel(ResourceModel newModel,
			NotificationChain msgs) {
		ResourceModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, APIBlueprintModelPackage.RESOURCE__MODEL,
					oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Resource#getModel <em>Model</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	public void setModel(ResourceModel newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- APIBlueprintModelPackage.RESOURCE__MODEL,
						null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- APIBlueprintModelPackage.RESOURCE__MODEL,
						null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.RESOURCE__MODEL, newModel,
					newModel));
	}

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.Action}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getResource_Actions()
	 * @model containment="true"
	 * @generated
	 */
	public List<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this,
					APIBlueprintModelPackage.RESOURCE__ACTIONS);
		}
		return actions;
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
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
			return ((InternalEList<?>) getHeaders())
					.basicRemove(otherEnd, msgs);
		case APIBlueprintModelPackage.RESOURCE__MODEL:
			return basicSetModel(null, msgs);
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			return ((InternalEList<?>) getActions())
					.basicRemove(otherEnd, msgs);
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
		case APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE:
			return getUriTemplate();
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
			return getParameters();
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
			return getHeaders();
		case APIBlueprintModelPackage.RESOURCE__MODEL:
			return getModel();
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			return getActions();
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
		case APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE:
			setUriTemplate((String) newValue);
			return;
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
			getHeaders().clear();
			getHeaders().addAll((Collection<? extends NameValueType>) newValue);
			return;
		case APIBlueprintModelPackage.RESOURCE__MODEL:
			setModel((ResourceModel) newValue);
			return;
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
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
		case APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE:
			setUriTemplate(URI_TEMPLATE_EDEFAULT);
			return;
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
			getParameters().clear();
			return;
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
			getHeaders().clear();
			return;
		case APIBlueprintModelPackage.RESOURCE__MODEL:
			setModel((ResourceModel) null);
			return;
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			getActions().clear();
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
		case APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE:
			return URI_TEMPLATE_EDEFAULT == null ? uriTemplate != null
					: !URI_TEMPLATE_EDEFAULT.equals(uriTemplate);
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
			return headers != null && !headers.isEmpty();
		case APIBlueprintModelPackage.RESOURCE__MODEL:
			return model != null;
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			return actions != null && !actions.isEmpty();
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
		result.append(" (uriTemplate: ");
		result.append(uriTemplate);
		result.append(')');
		return result.toString();
	}

} // Resource
