/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.util;

import java.util.Map;

import net.thwack.eclipse.apiblueprint.java_generator.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage
 * @generated
 */
public class APIBlueprintModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static APIBlueprintModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public APIBlueprintModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = APIBlueprintModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected APIBlueprintModelSwitch<Adapter> modelSwitch = new APIBlueprintModelSwitch<Adapter>() {
		@Override
		public Adapter caseAPIBlueprint(APIBlueprint object) {
			return createAPIBlueprintAdapter();
		}

		@Override
		public Adapter caseNameValueType(NameValueType object) {
			return createNameValueTypeAdapter();
		}

		@Override
		public Adapter caseResourceGroup(ResourceGroup object) {
			return createResourceGroupAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseBase(Base object) {
			return createBaseAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter casePayload(Payload object) {
			return createPayloadAdapter();
		}

		@Override
		public Adapter caseStringToParameterMap(
				Map.Entry<String, Parameter> object) {
			return createStringToParameterMapAdapter();
		}

		@Override
		public Adapter caseResourceModel(ResourceModel object) {
			return createResourceModelAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter caseResponse(Response object) {
			return createResponseAdapter();
		}

		@Override
		public Adapter caseTransactionExample(TransactionExample object) {
			return createTransactionExampleAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint <em>API Blueprint</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprint
	 * @generated
	 */
	public Adapter createAPIBlueprintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * <em>Name Value Type</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.NameValueType
	 * @generated
	 */
	public Adapter createNameValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * <em>Resource Group</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup
	 * @generated
	 */
	public Adapter createResourceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource <em>Resource</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Base <em>Base</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Parameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Payload <em>Payload</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Payload
	 * @generated
	 */
	public Adapter createPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry
	 * <em>String To Parameter Map</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToParameterMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * <em>Resource Model</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel
	 * @generated
	 */
	public Adapter createResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Action <em>Action</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Request <em>Request</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Response <em>Response</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * <em>Transaction Example</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.TransactionExample
	 * @generated
	 */
	public Adapter createTransactionExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Reference <em>Reference</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see net.thwack.eclipse.apiblueprint.java_generator.model.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // APIBlueprintModelAdapterFactory
