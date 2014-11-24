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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>API Blueprint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.apiblueprint.model.APIBlueprint#getMetadata <em>
 * Metadata</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.APIBlueprint#getResourceGroups <em>
 * Resource Groups</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.APIBlueprint#get_version <em>version
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAPIBlueprint()
 * @model kind="class"
 * @generated
 */
public class APIBlueprint extends Base {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValueType> metadata;

	/**
	 * The cached value of the '{@link #getResourceGroups()
	 * <em>Resource Groups</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResourceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> resourceGroups;

	/**
	 * The default value of the '{@link #get_version() <em>version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_version()
	 * @generated
	 * @ordered
	 */
	protected static final String _VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_version() <em>version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #get_version()
	 * @generated
	 * @ordered
	 */
	protected String _version = _VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected APIBlueprint() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.API_BLUEPRINT;
	}

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.NameValueType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAPIBlueprint_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	public List<NameValueType> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<NameValueType>(
					NameValueType.class, this,
					APIBlueprintModelPackage.API_BLUEPRINT__METADATA);
		}
		return metadata;
	}

	/**
	 * Returns the value of the '<em><b>Resource Groups</b></em>' reference
	 * list. The list contents are of type
	 * {@link net.thwack.apiblueprint.model.ResourceGroup}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Resource Groups</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resource Groups</em>' reference list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAPIBlueprint_ResourceGroups()
	 * @model
	 * @generated
	 */
	public List<ResourceGroup> getResourceGroups() {
		if (resourceGroups == null) {
			resourceGroups = new EObjectResolvingEList<ResourceGroup>(
					ResourceGroup.class, this,
					APIBlueprintModelPackage.API_BLUEPRINT__RESOURCE_GROUPS);
		}
		return resourceGroups;
	}

	/**
	 * Returns the value of the '<em><b>version</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>version</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>version</em>' attribute.
	 * @see #set_version(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getAPIBlueprint__version()
	 * @model
	 * @generated
	 */
	public String get_version() {
		return _version;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.APIBlueprint#get_version
	 * <em>version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>version</em>' attribute.
	 * @see #get_version()
	 * @generated
	 */
	public void set_version(String new_version) {
		String old_version = _version;
		_version = new_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.API_BLUEPRINT__VERSION,
					old_version, _version));
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
		case APIBlueprintModelPackage.API_BLUEPRINT__METADATA:
			return ((InternalEList<?>) getMetadata()).basicRemove(otherEnd,
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
		case APIBlueprintModelPackage.API_BLUEPRINT__METADATA:
			return getMetadata();
		case APIBlueprintModelPackage.API_BLUEPRINT__RESOURCE_GROUPS:
			return getResourceGroups();
		case APIBlueprintModelPackage.API_BLUEPRINT__VERSION:
			return get_version();
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
		case APIBlueprintModelPackage.API_BLUEPRINT__METADATA:
			getMetadata().clear();
			getMetadata()
					.addAll((Collection<? extends NameValueType>) newValue);
			return;
		case APIBlueprintModelPackage.API_BLUEPRINT__RESOURCE_GROUPS:
			getResourceGroups().clear();
			getResourceGroups().addAll(
					(Collection<? extends ResourceGroup>) newValue);
			return;
		case APIBlueprintModelPackage.API_BLUEPRINT__VERSION:
			set_version((String) newValue);
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
		case APIBlueprintModelPackage.API_BLUEPRINT__METADATA:
			getMetadata().clear();
			return;
		case APIBlueprintModelPackage.API_BLUEPRINT__RESOURCE_GROUPS:
			getResourceGroups().clear();
			return;
		case APIBlueprintModelPackage.API_BLUEPRINT__VERSION:
			set_version(_VERSION_EDEFAULT);
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
		case APIBlueprintModelPackage.API_BLUEPRINT__METADATA:
			return metadata != null && !metadata.isEmpty();
		case APIBlueprintModelPackage.API_BLUEPRINT__RESOURCE_GROUPS:
			return resourceGroups != null && !resourceGroups.isEmpty();
		case APIBlueprintModelPackage.API_BLUEPRINT__VERSION:
			return _VERSION_EDEFAULT == null ? _version != null
					: !_VERSION_EDEFAULT.equals(_version);
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
		result.append(" (_version: ");
		result.append(_version);
		result.append(')');
		return result.toString();
	}

} // APIBlueprint
