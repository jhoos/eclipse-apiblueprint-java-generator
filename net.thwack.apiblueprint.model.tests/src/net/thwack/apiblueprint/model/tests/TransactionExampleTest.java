/**
 */
package net.thwack.apiblueprint.model.tests;

import junit.textui.TestRunner;

import net.thwack.apiblueprint.model.APIBlueprintModelFactory;
import net.thwack.apiblueprint.model.TransactionExample;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Transaction Example</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransactionExampleTest extends BaseTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionExampleTest.class);
	}

	/**
	 * Constructs a new Transaction Example test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransactionExampleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transaction Example test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected TransactionExample getFixture() {
		return (TransactionExample) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE
				.createTransactionExample());
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

} // TransactionExampleTest
