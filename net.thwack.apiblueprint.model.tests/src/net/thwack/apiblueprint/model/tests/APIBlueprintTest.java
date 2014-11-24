/**
 */
package net.thwack.apiblueprint.model.tests;

import junit.textui.TestRunner;

import net.thwack.apiblueprint.model.APIBlueprint;
import net.thwack.apiblueprint.model.APIBlueprintModelFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>API Blueprint</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class APIBlueprintTest extends BaseTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APIBlueprintTest.class);
	}

	/**
	 * Constructs a new API Blueprint test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public APIBlueprintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this API Blueprint test case. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected APIBlueprint getFixture() {
		return (APIBlueprint) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createAPIBlueprint());
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

} // APIBlueprintTest
