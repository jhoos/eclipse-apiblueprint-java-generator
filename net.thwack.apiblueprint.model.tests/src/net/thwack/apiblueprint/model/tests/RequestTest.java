/**
 */
package net.thwack.apiblueprint.model.tests;

import junit.textui.TestRunner;

import net.thwack.apiblueprint.model.APIBlueprintModelFactory;
import net.thwack.apiblueprint.model.Request;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Request</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class RequestTest extends PayloadTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequestTest.class);
	}

	/**
	 * Constructs a new Request test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RequestTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Request test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Request getFixture() {
		return (Request) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createRequest());
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

} // RequestTest
