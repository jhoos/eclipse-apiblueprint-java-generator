/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage
 * @generated
 */
public class APIBlueprintModelFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final APIBlueprintModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static APIBlueprintModelFactory init() {
		try {
			APIBlueprintModelFactory theAPIBlueprintModelFactory = (APIBlueprintModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(APIBlueprintModelPackage.eNS_URI);
			if (theAPIBlueprintModelFactory != null) {
				return theAPIBlueprintModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APIBlueprintModelFactory();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public APIBlueprintModelFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case APIBlueprintModelPackage.API_BLUEPRINT:
			return createAPIBlueprint();
		case APIBlueprintModelPackage.NAME_VALUE_TYPE:
			return createNameValueType();
		case APIBlueprintModelPackage.RESOURCE_GROUP:
			return createResourceGroup();
		case APIBlueprintModelPackage.RESOURCE:
			return createResource();
		case APIBlueprintModelPackage.BASE:
			return createBase();
		case APIBlueprintModelPackage.PARAMETER:
			return createParameter();
		case APIBlueprintModelPackage.PAYLOAD:
			return createPayload();
		case APIBlueprintModelPackage.STRING_TO_PARAMETER_MAP:
			return (EObject) createStringToParameterMap();
		case APIBlueprintModelPackage.RESOURCE_MODEL:
			return createResourceModel();
		case APIBlueprintModelPackage.ACTION:
			return createAction();
		case APIBlueprintModelPackage.REQUEST:
			return createRequest();
		case APIBlueprintModelPackage.RESPONSE:
			return createResponse();
		case APIBlueprintModelPackage.TRANSACTION_EXAMPLE:
			return createTransactionExample();
		case APIBlueprintModelPackage.REFERENCE:
			return createReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public APIBlueprint createAPIBlueprint() {
		APIBlueprint apiBlueprint = new APIBlueprint();
		return apiBlueprint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameValueType createNameValueType() {
		NameValueType nameValueType = new NameValueType();
		return nameValueType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceGroup createResourceGroup() {
		ResourceGroup resourceGroup = new ResourceGroup();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource createResource() {
		Resource resource = new Resource();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Base createBase() {
		Base base = new Base();
		return base;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createParameter() {
		Parameter parameter = new Parameter();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Payload createPayload() {
		Payload payload = new Payload();
		return payload;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<String, Parameter> createStringToParameterMap() {
		StringToParameterMap stringToParameterMap = new StringToParameterMap();
		return stringToParameterMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceModel createResourceModel() {
		ResourceModel resourceModel = new ResourceModel();
		return resourceModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Action createAction() {
		Action action = new Action();
		return action;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Request createRequest() {
		Request request = new Request();
		return request;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Response createResponse() {
		Response response = new Response();
		return response;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransactionExample createTransactionExample() {
		TransactionExample transactionExample = new TransactionExample();
		return transactionExample;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Reference createReference() {
		Reference reference = new Reference();
		return reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public APIBlueprintModelPackage getAPIBlueprintModelPackage() {
		return (APIBlueprintModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APIBlueprintModelPackage getPackage() {
		return APIBlueprintModelPackage.eINSTANCE;
	}

} // APIBlueprintModelFactory
