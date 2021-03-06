/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.provider;

import java.util.Collection;
import java.util.List;

import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage;
import net.thwack.eclipse.apiblueprint.java_generator.model.Resource;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link net.thwack.eclipse.apiblueprint.java_generator.model.Resource} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceItemProvider extends BaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUriTemplatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri Template feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUriTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Resource_uriTemplate_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Resource_uriTemplate_feature",
								"_UI_Resource_type"),
						APIBlueprintModelPackage.Literals.RESOURCE__URI_TEMPLATE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(APIBlueprintModelPackage.Literals.RESOURCE__PARAMETERS);
			childrenFeatures
					.add(APIBlueprintModelPackage.Literals.RESOURCE__HEADERS);
			childrenFeatures
					.add(APIBlueprintModelPackage.Literals.RESOURCE__MODEL);
			childrenFeatures
					.add(APIBlueprintModelPackage.Literals.RESOURCE__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Resource.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Resource"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Resource) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Resource_type")
				: getString("_UI_Resource_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Resource.class)) {
		case APIBlueprintModelPackage.RESOURCE__URI_TEMPLATE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case APIBlueprintModelPackage.RESOURCE__PARAMETERS:
		case APIBlueprintModelPackage.RESOURCE__HEADERS:
		case APIBlueprintModelPackage.RESOURCE__MODEL:
		case APIBlueprintModelPackage.RESOURCE__ACTIONS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				APIBlueprintModelPackage.Literals.RESOURCE__PARAMETERS,
				APIBlueprintModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
				APIBlueprintModelPackage.Literals.RESOURCE__HEADERS,
				APIBlueprintModelFactory.eINSTANCE.createNameValueType()));

		newChildDescriptors.add(createChildParameter(
				APIBlueprintModelPackage.Literals.RESOURCE__MODEL,
				APIBlueprintModelFactory.eINSTANCE.createResourceModel()));

		newChildDescriptors.add(createChildParameter(
				APIBlueprintModelPackage.Literals.RESOURCE__ACTIONS,
				APIBlueprintModelFactory.eINSTANCE.createAction()));
	}

}
