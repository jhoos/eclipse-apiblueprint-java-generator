/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import junit.textui.TestRunner;

import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.Response;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Response</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResponseTest extends PayloadTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResponseTest.class);
	}

	/**
	 * Constructs a new Response test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResponseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Response test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Response getFixture() {
		return (Response) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createResponse());
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

} // ResponseTest
