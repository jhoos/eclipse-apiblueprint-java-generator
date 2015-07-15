/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory
 * @model kind="package"
 * @generated
 */
public class APIBlueprintModelPackage extends EPackageImpl {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNS_URI = "http://thwack.net/model/apiblueprint";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNS_PREFIX = "apiblueprint.model";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final APIBlueprintModelPackage eINSTANCE = net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage
			.init();

	/**
	 * The meta object id for the '{@link net.thwack.eclipse.apiblueprint.java_generator.model.Base
	 * <em>Base</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getBase()
	 * @generated
	 */
	public static final int BASE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BASE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint <em>API Blueprint</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getAPIBlueprint()
	 * @generated
	 */
	public static final int API_BLUEPRINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT__METADATA = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT__RESOURCE_GROUPS = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT__VERSION = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>API Blueprint</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT_FEATURE_COUNT = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>API Blueprint</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int API_BLUEPRINT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * <em>Name Value Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getNameValueType()
	 * @generated
	 */
	public static final int NAME_VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name Value Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Value Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * <em>Resource Group</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResourceGroup()
	 * @generated
	 */
	public static final int RESOURCE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP__RESOURCES = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Group</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_GROUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResource()
	 * @generated
	 */
	public static final int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri Template</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__URI_TEMPLATE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__PARAMETERS = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__HEADERS = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__MODEL = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__ACTIONS = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter <em>Parameter</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getParameter()
	 * @generated
	 */
	public static final int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__DEFAULT = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__EXAMPLE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__TYPE = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__VALUES = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__REQUIRED = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload
	 * <em>Payload</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload()
	 * @generated
	 */
	public static final int PAYLOAD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__BODY = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__SCHEMA = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__PARAMETERS = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__HEADERS = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD__REFERENCE = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Payload</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Payload</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.StringToParameterMap
	 * <em>String To Parameter Map</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.StringToParameterMap
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getStringToParameterMap()
	 * @generated
	 */
	public static final int STRING_TO_PARAMETER_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_PARAMETER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_PARAMETER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '
	 * <em>String To Parameter Map</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_PARAMETER_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Parameter Map</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_PARAMETER_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * <em>Resource Model</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResourceModel()
	 * @generated
	 */
	public static final int RESOURCE_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__NAME = PAYLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__DESCRIPTION = PAYLOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__BODY = PAYLOAD__BODY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__SCHEMA = PAYLOAD__SCHEMA;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__PARAMETERS = PAYLOAD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__HEADERS = PAYLOAD__HEADERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL__REFERENCE = PAYLOAD__REFERENCE;

	/**
	 * The number of structural features of the '<em>Resource Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL_FEATURE_COUNT = PAYLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MODEL_OPERATION_COUNT = PAYLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.thwack.eclipse.apiblueprint.java_generator.model.Action
	 * <em>Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__HEADERS = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__METHOD = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__PARAMETERS = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__EXAMPLES = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.thwack.eclipse.apiblueprint.java_generator.model.Request
	 * <em>Request</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Request
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getRequest()
	 * @generated
	 */
	public static final int REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__NAME = PAYLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__DESCRIPTION = PAYLOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__BODY = PAYLOAD__BODY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__SCHEMA = PAYLOAD__SCHEMA;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__PARAMETERS = PAYLOAD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__HEADERS = PAYLOAD__HEADERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__REFERENCE = PAYLOAD__REFERENCE;

	/**
	 * The number of structural features of the '<em>Request</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_FEATURE_COUNT = PAYLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_OPERATION_COUNT = PAYLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Response <em>Response</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Response
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResponse()
	 * @generated
	 */
	public static final int RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__NAME = PAYLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__DESCRIPTION = PAYLOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__BODY = PAYLOAD__BODY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__SCHEMA = PAYLOAD__SCHEMA;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__PARAMETERS = PAYLOAD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__HEADERS = PAYLOAD__HEADERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE__REFERENCE = PAYLOAD__REFERENCE;

	/**
	 * The number of structural features of the '<em>Response</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_FEATURE_COUNT = PAYLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_OPERATION_COUNT = PAYLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * <em>Transaction Example</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getTransactionExample()
	 * @generated
	 */
	public static final int TRANSACTION_EXAMPLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE__RESPONSES = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE__REQUESTS = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction Example</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transaction Example</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_EXAMPLE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Reference <em>Reference</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Reference
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getReference()
	 * @generated
	 */
	public static final int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE__ID = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apiBlueprintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nameValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass payloadEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stringToParameterMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transactionExampleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private APIBlueprintModelPackage() {
		super(eNS_URI, APIBlueprintModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize
	 * {@link APIBlueprintModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static APIBlueprintModelPackage init() {
		if (isInited)
			return (APIBlueprintModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(APIBlueprintModelPackage.eNS_URI);

		// Obtain or create and register package
		APIBlueprintModelPackage theAPIBlueprintModelPackage = (APIBlueprintModelPackage) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof APIBlueprintModelPackage ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new APIBlueprintModelPackage());

		isInited = true;

		// Create package meta-data objects
		theAPIBlueprintModelPackage.createPackageContents();

		// Initialize created meta-data
		theAPIBlueprintModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAPIBlueprintModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(APIBlueprintModelPackage.eNS_URI,
				theAPIBlueprintModelPackage);
		return theAPIBlueprintModelPackage;
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint <em>API Blueprint</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>API Blueprint</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint
	 * @generated
	 */
	public EClass getAPIBlueprint() {
		return apiBlueprintEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Metadata</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#getMetadata()
	 * @see #getAPIBlueprint()
	 * @generated
	 */
	public EReference getAPIBlueprint_Metadata() {
		return (EReference) apiBlueprintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#getResourceGroups
	 * <em>Resource Groups</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Resource Groups</em>
	 *         '.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#getResourceGroups()
	 * @see #getAPIBlueprint()
	 * @generated
	 */
	public EReference getAPIBlueprint_ResourceGroups() {
		return (EReference) apiBlueprintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#get_version
	 * <em>version</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>version</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint#get_version()
	 * @see #getAPIBlueprint()
	 * @generated
	 */
	public EAttribute getAPIBlueprint__version() {
		return (EAttribute) apiBlueprintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * <em>Name Value Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Value Type</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * @generated
	 */
	public EClass getNameValueType() {
		return nameValueTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType#getName()
	 * @see #getNameValueType()
	 * @generated
	 */
	public EAttribute getNameValueType_Name() {
		return (EAttribute) nameValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType#getValue()
	 * @see #getNameValueType()
	 * @generated
	 */
	public EAttribute getNameValueType_Value() {
		return (EAttribute) nameValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * <em>Resource Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * @generated
	 */
	public EClass getResourceGroup() {
		return resourceGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup#getResources
	 * <em>Resources</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup#getResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	public EReference getResourceGroup_Resources() {
		return (EReference) resourceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource <em>Resource</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getUriTemplate
	 * <em>Uri Template</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri Template</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getUriTemplate()
	 * @see #getResource()
	 * @generated
	 */
	public EAttribute getResource_UriTemplate() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameters</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getParameters()
	 * @see #getResource()
	 * @generated
	 */
	public EReference getResource_Parameters() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getHeaders
	 * <em>Headers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Headers</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getHeaders()
	 * @see #getResource()
	 * @generated
	 */
	public EReference getResource_Headers() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getModel()
	 * @see #getResource()
	 * @generated
	 */
	public EReference getResource_Model() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getActions
	 * <em>Actions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Actions</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource#getActions()
	 * @see #getResource()
	 * @generated
	 */
	public EReference getResource_Actions() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Base <em>Base</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Base</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base
	 * @generated
	 */
	public EClass getBase() {
		return baseEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Base#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base#getName()
	 * @see #getBase()
	 * @generated
	 */
	public EAttribute getBase_Name() {
		return (EAttribute) baseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Base#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base#getDescription()
	 * @see #getBase()
	 * @generated
	 */
	public EAttribute getBase_Description() {
		return (EAttribute) baseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getDefault
	 * <em>Default</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getExample
	 * <em>Example</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getExample()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Example() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getValues <em>Values</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Values() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#isRequired
	 * <em>Required</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Required() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload <em>Payload</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload
	 * @generated
	 */
	public EClass getPayload() {
		return payloadEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getBody()
	 * @see #getPayload()
	 * @generated
	 */
	public EAttribute getPayload_Body() {
		return (EAttribute) payloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getSchema()
	 * @see #getPayload()
	 * @generated
	 */
	public EAttribute getPayload_Schema() {
		return (EAttribute) payloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameters</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getParameters()
	 * @see #getPayload()
	 * @generated
	 */
	public EReference getPayload_Parameters() {
		return (EReference) payloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getHeaders <em>Headers</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Headers</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getHeaders()
	 * @see #getPayload()
	 * @generated
	 */
	public EReference getPayload_Headers() {
		return (EReference) payloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getReference
	 * <em>Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload#getReference()
	 * @see #getPayload()
	 * @generated
	 */
	public EReference getPayload_Reference() {
		return (EReference) payloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry
	 * <em>String To Parameter Map</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>String To Parameter Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="net.thwack.eclipse.apiblueprint.java_generator.model.Parameter"
	 *        valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getStringToParameterMap() {
		return stringToParameterMapEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry
	 * <em>Key</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterMap()
	 * @generated
	 */
	public EAttribute getStringToParameterMap_Key() {
		return (EAttribute) stringToParameterMapEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for the containment reference '
	 * {@link java.util.Map.Entry <em>Value</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterMap()
	 * @generated
	 */
	public EReference getStringToParameterMap_Value() {
		return (EReference) stringToParameterMapEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * <em>Resource Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Model</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * @generated
	 */
	public EClass getResourceModel() {
		return resourceModelEClass;
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action <em>Action</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action#getHeaders <em>Headers</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Headers</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action#getHeaders()
	 * @see #getAction()
	 * @generated
	 */
	public EReference getAction_Headers() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action#getMethod()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_Method() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameters</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	public EReference getAction_Parameters() {
		return (EReference) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action#getExamples
	 * <em>Examples</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Examples</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action#getExamples()
	 * @see #getAction()
	 * @generated
	 */
	public EReference getAction_Examples() {
		return (EReference) actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Request <em>Request</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Request</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Request
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Response <em>Response</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Response</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Response
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * <em>Transaction Example</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Transaction Example</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * @generated
	 */
	public EClass getTransactionExample() {
		return transactionExampleEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample#getResponses
	 * <em>Responses</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Responses</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample#getResponses()
	 * @see #getTransactionExample()
	 * @generated
	 */
	public EReference getTransactionExample_Responses() {
		return (EReference) transactionExampleEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample#getRequests
	 * <em>Requests</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Requests</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample#getRequests()
	 * @see #getTransactionExample()
	 * @generated
	 */
	public EReference getTransactionExample_Requests() {
		return (EReference) transactionExampleEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * Returns the meta object for class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Reference <em>Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Reference
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Reference#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Reference#getId()
	 * @see #getReference()
	 * @generated
	 */
	public EAttribute getReference_Id() {
		return (EAttribute) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public APIBlueprintModelFactory getAPIBlueprintModelFactory() {
		return (APIBlueprintModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		apiBlueprintEClass = createEClass(API_BLUEPRINT);
		createEReference(apiBlueprintEClass, API_BLUEPRINT__METADATA);
		createEReference(apiBlueprintEClass, API_BLUEPRINT__RESOURCE_GROUPS);
		createEAttribute(apiBlueprintEClass, API_BLUEPRINT__VERSION);

		nameValueTypeEClass = createEClass(NAME_VALUE_TYPE);
		createEAttribute(nameValueTypeEClass, NAME_VALUE_TYPE__NAME);
		createEAttribute(nameValueTypeEClass, NAME_VALUE_TYPE__VALUE);

		resourceGroupEClass = createEClass(RESOURCE_GROUP);
		createEReference(resourceGroupEClass, RESOURCE_GROUP__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__URI_TEMPLATE);
		createEReference(resourceEClass, RESOURCE__PARAMETERS);
		createEReference(resourceEClass, RESOURCE__HEADERS);
		createEReference(resourceEClass, RESOURCE__MODEL);
		createEReference(resourceEClass, RESOURCE__ACTIONS);

		baseEClass = createEClass(BASE);
		createEAttribute(baseEClass, BASE__NAME);
		createEAttribute(baseEClass, BASE__DESCRIPTION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEAttribute(parameterEClass, PARAMETER__EXAMPLE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__VALUES);
		createEAttribute(parameterEClass, PARAMETER__REQUIRED);

		payloadEClass = createEClass(PAYLOAD);
		createEAttribute(payloadEClass, PAYLOAD__BODY);
		createEAttribute(payloadEClass, PAYLOAD__SCHEMA);
		createEReference(payloadEClass, PAYLOAD__PARAMETERS);
		createEReference(payloadEClass, PAYLOAD__HEADERS);
		createEReference(payloadEClass, PAYLOAD__REFERENCE);

		stringToParameterMapEClass = createEClass(STRING_TO_PARAMETER_MAP);
		createEAttribute(stringToParameterMapEClass,
				STRING_TO_PARAMETER_MAP__KEY);
		createEReference(stringToParameterMapEClass,
				STRING_TO_PARAMETER_MAP__VALUE);

		resourceModelEClass = createEClass(RESOURCE_MODEL);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__HEADERS);
		createEAttribute(actionEClass, ACTION__METHOD);
		createEReference(actionEClass, ACTION__PARAMETERS);
		createEReference(actionEClass, ACTION__EXAMPLES);

		requestEClass = createEClass(REQUEST);

		responseEClass = createEClass(RESPONSE);

		transactionExampleEClass = createEClass(TRANSACTION_EXAMPLE);
		createEReference(transactionExampleEClass,
				TRANSACTION_EXAMPLE__RESPONSES);
		createEReference(transactionExampleEClass,
				TRANSACTION_EXAMPLE__REQUESTS);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiBlueprintEClass.getESuperTypes().add(this.getBase());
		resourceGroupEClass.getESuperTypes().add(this.getBase());
		resourceEClass.getESuperTypes().add(this.getBase());
		parameterEClass.getESuperTypes().add(this.getBase());
		payloadEClass.getESuperTypes().add(this.getBase());
		resourceModelEClass.getESuperTypes().add(this.getPayload());
		actionEClass.getESuperTypes().add(this.getBase());
		requestEClass.getESuperTypes().add(this.getPayload());
		responseEClass.getESuperTypes().add(this.getPayload());
		transactionExampleEClass.getESuperTypes().add(this.getBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(apiBlueprintEClass, APIBlueprint.class, "APIBlueprint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPIBlueprint_Metadata(), this.getNameValueType(),
				null, "metadata", null, 0, -1, APIBlueprint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAPIBlueprint_ResourceGroups(),
				this.getResourceGroup(), null, "resourceGroups", null, 0, -1,
				APIBlueprint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPIBlueprint__version(), ecorePackage.getEString(),
				"_version", null, 0, 1, APIBlueprint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nameValueTypeEClass, NameValueType.class, "NameValueType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameValueType_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, NameValueType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameValueType_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, NameValueType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resourceGroupEClass, ResourceGroup.class, "ResourceGroup",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceGroup_Resources(), this.getResource(), null,
				"resources", null, 0, -1, ResourceGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_UriTemplate(), ecorePackage.getEString(),
				"uriTemplate", null, 0, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Parameters(), this.getParameter(), null,
				"parameters", null, 0, -1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Headers(), this.getNameValueType(), null,
				"headers", null, 0, -1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Model(), this.getResourceModel(), null,
				"model", null, 0, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Actions(), this.getAction(), null,
				"actions", null, 0, -1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase_Name(), ecorePackage.getEString(), "name", null,
				0, 1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, Base.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Default(), ecorePackage.getEString(),
				"default", null, 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Example(), ecorePackage.getEString(),
				"example", null, 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type",
				null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getParameter_Values(), ecorePackage.getEString(),
				"values", null, 0, -1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required(), ecorePackage.getEBoolean(),
				"required", "true", 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayload_Body(), ecorePackage.getEString(), "body",
				null, 0, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPayload_Schema(), ecorePackage.getEString(),
				"schema", null, 0, 1, Payload.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPayload_Parameters(), this.getParameter(), null,
				"parameters", null, 0, -1, Payload.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayload_Headers(), this.getNameValueType(), null,
				"headers", null, 0, -1, Payload.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayload_Reference(), this.getReference(), null,
				"reference", null, 0, 1, Payload.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToParameterMapEClass, Map.Entry.class,
				"StringToParameterMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToParameterMap_Key(),
				ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToParameterMap_Value(), this.getParameter(),
				null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceModelEClass, ResourceModel.class, "ResourceModel",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Headers(), this.getNameValueType(), null,
				"headers", null, 0, -1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Method(), ecorePackage.getEString(), "method",
				null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAction_Parameters(), this.getParameter(), null,
				"parameters", null, 0, -1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Examples(), this.getTransactionExample(),
				null, "examples", null, 0, -1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transactionExampleEClass, TransactionExample.class,
				"TransactionExample", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionExample_Responses(), this.getResponse(),
				null, "responses", null, 0, -1, TransactionExample.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTransactionExample_Requests(), this.getRequest(),
				null, "requests", null, 0, -1, TransactionExample.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Id(), ecorePackage.getEString(), "id",
				null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint
		 * <em>API Blueprint</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getAPIBlueprint()
		 * @generated
		 */
		public static final EClass API_BLUEPRINT = eINSTANCE.getAPIBlueprint();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference API_BLUEPRINT__METADATA = eINSTANCE
				.getAPIBlueprint_Metadata();

		/**
		 * The meta object literal for the '<em><b>Resource Groups</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference API_BLUEPRINT__RESOURCE_GROUPS = eINSTANCE
				.getAPIBlueprint_ResourceGroups();

		/**
		 * The meta object literal for the '<em><b>version</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute API_BLUEPRINT__VERSION = eINSTANCE
				.getAPIBlueprint__version();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
		 * <em>Name Value Type</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getNameValueType()
		 * @generated
		 */
		public static final EClass NAME_VALUE_TYPE = eINSTANCE
				.getNameValueType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute NAME_VALUE_TYPE__NAME = eINSTANCE
				.getNameValueType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute NAME_VALUE_TYPE__VALUE = eINSTANCE
				.getNameValueType_Value();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
		 * <em>Resource Group</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResourceGroup()
		 * @generated
		 */
		public static final EClass RESOURCE_GROUP = eINSTANCE
				.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference RESOURCE_GROUP__RESOURCES = eINSTANCE
				.getResourceGroup_Resources();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource <em>Resource</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResource()
		 * @generated
		 */
		public static final EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Uri Template</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute RESOURCE__URI_TEMPLATE = eINSTANCE
				.getResource_UriTemplate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference RESOURCE__PARAMETERS = eINSTANCE
				.getResource_Parameters();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference RESOURCE__HEADERS = eINSTANCE
				.getResource_Headers();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference RESOURCE__MODEL = eINSTANCE
				.getResource_Model();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference RESOURCE__ACTIONS = eINSTANCE
				.getResource_Actions();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Base <em>Base</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getBase()
		 * @generated
		 */
		public static final EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute BASE__NAME = eINSTANCE.getBase_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute BASE__DESCRIPTION = eINSTANCE
				.getBase_Description();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter <em>Parameter</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getParameter()
		 * @generated
		 */
		public static final EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PARAMETER__DEFAULT = eINSTANCE
				.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PARAMETER__EXAMPLE = eINSTANCE
				.getParameter_Example();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PARAMETER__TYPE = eINSTANCE
				.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PARAMETER__VALUES = eINSTANCE
				.getParameter_Values();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PARAMETER__REQUIRED = eINSTANCE
				.getParameter_Required();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload <em>Payload</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getPayload()
		 * @generated
		 */
		public static final EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PAYLOAD__BODY = eINSTANCE
				.getPayload_Body();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute PAYLOAD__SCHEMA = eINSTANCE
				.getPayload_Schema();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference PAYLOAD__PARAMETERS = eINSTANCE
				.getPayload_Parameters();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference PAYLOAD__HEADERS = eINSTANCE
				.getPayload_Headers();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference PAYLOAD__REFERENCE = eINSTANCE
				.getPayload_Reference();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.StringToParameterMap
		 * <em>String To Parameter Map</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.StringToParameterMap
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getStringToParameterMap()
		 * @generated
		 */
		public static final EClass STRING_TO_PARAMETER_MAP = eINSTANCE
				.getStringToParameterMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute STRING_TO_PARAMETER_MAP__KEY = eINSTANCE
				.getStringToParameterMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference STRING_TO_PARAMETER_MAP__VALUE = eINSTANCE
				.getStringToParameterMap_Value();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
		 * <em>Resource Model</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResourceModel()
		 * @generated
		 */
		public static final EClass RESOURCE_MODEL = eINSTANCE
				.getResourceModel();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference ACTION__HEADERS = eINSTANCE
				.getAction_Headers();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute ACTION__METHOD = eINSTANCE
				.getAction_Method();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference ACTION__PARAMETERS = eINSTANCE
				.getAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference ACTION__EXAMPLES = eINSTANCE
				.getAction_Examples();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Request <em>Request</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Request
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getRequest()
		 * @generated
		 */
		public static final EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Response <em>Response</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Response
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getResponse()
		 * @generated
		 */
		public static final EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
		 * <em>Transaction Example</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getTransactionExample()
		 * @generated
		 */
		public static final EClass TRANSACTION_EXAMPLE = eINSTANCE
				.getTransactionExample();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference TRANSACTION_EXAMPLE__RESPONSES = eINSTANCE
				.getTransactionExample_Responses();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EReference TRANSACTION_EXAMPLE__REQUESTS = eINSTANCE
				.getTransactionExample_Requests();

		/**
		 * The meta object literal for the '
		 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Reference <em>Reference</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Reference
		 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage#getReference()
		 * @generated
		 */
		public static final EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public static final EAttribute REFERENCE__ID = eINSTANCE
				.getReference_Id();

	}

} // APIBlueprintModelPackage
