/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import junit.textui.TestRunner;

import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.ResourceGroup;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Resource Group</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceGroupTest extends BaseTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceGroupTest.class);
	}

	/**
	 * Constructs a new Resource Group test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Group test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected ResourceGroup getFixture() {
		return (ResourceGroup) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createResourceGroup());
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

} // ResourceGroupTest
