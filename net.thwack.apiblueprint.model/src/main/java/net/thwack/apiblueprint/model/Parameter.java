/**
 */
package net.thwack.apiblueprint.model;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.thwack.apiblueprint.model.Parameter#getDefault <em>Default
 * </em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Parameter#getExample <em>Example
 * </em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Parameter#getType <em>Type</em>}</li>
 * <li>{@link net.thwack.apiblueprint.model.Parameter#getValues <em>Values</em>}
 * </li>
 * <li>{@link net.thwack.apiblueprint.model.Parameter#isRequired <em>Required
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter()
 * @model kind="class"
 * @generated
 */
public class Parameter extends Base {
	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Parameter() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APIBlueprintModelPackage.Literals.PARAMETER;
	}

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter_Default()
	 * @model
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Parameter#getDefault
	 * <em>Default</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PARAMETER__DEFAULT, oldDefault,
					default_));
	}

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter_Example()
	 * @model
	 * @generated
	 */
	public String getExample() {
		return example;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Parameter#getExample
	 * <em>Example</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PARAMETER__EXAMPLE, oldExample,
					example));
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Parameter#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.String}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter_Values()
	 * @model
	 * @generated
	 */
	public List<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this,
					APIBlueprintModelPackage.PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute. The
	 * default value is <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see net.thwack.apiblueprint.model.APIBlueprintModelPackage#getParameter_Required()
	 * @model default="true"
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * Sets the value of the '
	 * {@link net.thwack.apiblueprint.model.Parameter#isRequired
	 * <em>Required</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					APIBlueprintModelPackage.PARAMETER__REQUIRED, oldRequired,
					required));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case APIBlueprintModelPackage.PARAMETER__DEFAULT:
			return getDefault();
		case APIBlueprintModelPackage.PARAMETER__EXAMPLE:
			return getExample();
		case APIBlueprintModelPackage.PARAMETER__TYPE:
			return getType();
		case APIBlueprintModelPackage.PARAMETER__VALUES:
			return getValues();
		case APIBlueprintModelPackage.PARAMETER__REQUIRED:
			return isRequired();
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
		case APIBlueprintModelPackage.PARAMETER__DEFAULT:
			setDefault((String) newValue);
			return;
		case APIBlueprintModelPackage.PARAMETER__EXAMPLE:
			setExample((String) newValue);
			return;
		case APIBlueprintModelPackage.PARAMETER__TYPE:
			setType((String) newValue);
			return;
		case APIBlueprintModelPackage.PARAMETER__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends String>) newValue);
			return;
		case APIBlueprintModelPackage.PARAMETER__REQUIRED:
			setRequired((Boolean) newValue);
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
		case APIBlueprintModelPackage.PARAMETER__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
			return;
		case APIBlueprintModelPackage.PARAMETER__EXAMPLE:
			setExample(EXAMPLE_EDEFAULT);
			return;
		case APIBlueprintModelPackage.PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case APIBlueprintModelPackage.PARAMETER__VALUES:
			getValues().clear();
			return;
		case APIBlueprintModelPackage.PARAMETER__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
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
		case APIBlueprintModelPackage.PARAMETER__DEFAULT:
			return DEFAULT_EDEFAULT == null ? default_ != null
					: !DEFAULT_EDEFAULT.equals(default_);
		case APIBlueprintModelPackage.PARAMETER__EXAMPLE:
			return EXAMPLE_EDEFAULT == null ? example != null
					: !EXAMPLE_EDEFAULT.equals(example);
		case APIBlueprintModelPackage.PARAMETER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case APIBlueprintModelPackage.PARAMETER__VALUES:
			return values != null && !values.isEmpty();
		case APIBlueprintModelPackage.PARAMETER__REQUIRED:
			return required != REQUIRED_EDEFAULT;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", example: ");
		result.append(example);
		result.append(", type: ");
		result.append(type);
		result.append(", values: ");
		result.append(values);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} // Parameter
