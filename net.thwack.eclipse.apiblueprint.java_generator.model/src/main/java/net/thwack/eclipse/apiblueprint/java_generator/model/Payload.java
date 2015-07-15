/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model;

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
 * <em><b>Payload</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getBody <em>Body</em>}</li>
 * <li>{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getSchema <em>Schema</em>}</li>
 * <li>{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getParameters <em>Parameters
 * </em>}</li>
 * <li>{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getHeaders <em>Headers</em>}
 * </li>
 * <li>{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getReference <em>Reference
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload()
 * @model kind="class"
 * @generated
 */
public class Payload extends Base {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Payload() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.PAYLOAD;
	}

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload_Body()
	 * @model
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getBody <em>Body</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PAYLOAD__BODY, oldBody, body));
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload_Schema()
	 * @model
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getSchema <em>Schema</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PAYLOAD__SCHEMA, oldSchema, schema));
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference
	 *         list.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	public List<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(
					Parameter.class, this,
					APIBlueprintModelPackage.PAYLOAD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload_Headers()
	 * @model containment="true"
	 * @generated
	 */
	public List<NameValueType> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<NameValueType>(
					NameValueType.class, this,
					APIBlueprintModelPackage.PAYLOAD__HEADERS);
		}
		return headers;
	}

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload_Reference()
	 * @model
	 * @generated
	 */
	public Reference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (Reference) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							APIBlueprintModelPackage.PAYLOAD__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Reference basicGetReference() {
		return reference;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getReference
	 * <em>Reference</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	public void setReference(Reference newReference) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PAYLOAD__REFERENCE, oldReference,
					reference));
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
		case APIBlueprintModelPackage.PAYLOAD__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
		case APIBlueprintModelPackage.PAYLOAD__HEADERS:
			return ((InternalEList<?>) getHeaders())
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
		case APIBlueprintModelPackage.PAYLOAD__BODY:
			return getBody();
		case APIBlueprintModelPackage.PAYLOAD__SCHEMA:
			return getSchema();
		case APIBlueprintModelPackage.PAYLOAD__PARAMETERS:
			return getParameters();
		case APIBlueprintModelPackage.PAYLOAD__HEADERS:
			return getHeaders();
		case APIBlueprintModelPackage.PAYLOAD__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
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
		case APIBlueprintModelPackage.PAYLOAD__BODY:
			setBody((String) newValue);
			return;
		case APIBlueprintModelPackage.PAYLOAD__SCHEMA:
			setSchema((String) newValue);
			return;
		case APIBlueprintModelPackage.PAYLOAD__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case APIBlueprintModelPackage.PAYLOAD__HEADERS:
			getHeaders().clear();
			getHeaders().addAll((Collection<? extends NameValueType>) newValue);
			return;
		case APIBlueprintModelPackage.PAYLOAD__REFERENCE:
			setReference((Reference) newValue);
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
		case APIBlueprintModelPackage.PAYLOAD__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case APIBlueprintModelPackage.PAYLOAD__SCHEMA:
			setSchema(SCHEMA_EDEFAULT);
			return;
		case APIBlueprintModelPackage.PAYLOAD__PARAMETERS:
			getParameters().clear();
			return;
		case APIBlueprintModelPackage.PAYLOAD__HEADERS:
			getHeaders().clear();
			return;
		case APIBlueprintModelPackage.PAYLOAD__REFERENCE:
			setReference((Reference) null);
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
		case APIBlueprintModelPackage.PAYLOAD__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT
					.equals(body);
		case APIBlueprintModelPackage.PAYLOAD__SCHEMA:
			return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT
					.equals(schema);
		case APIBlueprintModelPackage.PAYLOAD__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case APIBlueprintModelPackage.PAYLOAD__HEADERS:
			return headers != null && !headers.isEmpty();
		case APIBlueprintModelPackage.PAYLOAD__REFERENCE:
			return reference != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} // Payload
