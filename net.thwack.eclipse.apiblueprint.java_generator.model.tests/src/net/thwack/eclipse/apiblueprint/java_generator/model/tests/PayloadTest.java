/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import junit.textui.TestRunner;
import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.Payload;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Payload</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class PayloadTest extends BaseTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PayloadTest.class);
	}

	/**
	 * Constructs a new Payload test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PayloadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Payload test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Payload getFixture() {
		return (Payload) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createPayload());
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

} // PayloadTest
