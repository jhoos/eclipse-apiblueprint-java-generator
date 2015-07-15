/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import junit.textui.TestRunner;

import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.ResourceModel;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Resource Model</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceModelTest extends PayloadTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceModelTest.class);
	}

	/**
	 * Constructs a new Resource Model test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Model test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected ResourceModel getFixture() {
		return (ResourceModel) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createResourceModel());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // ResourceModelTest
