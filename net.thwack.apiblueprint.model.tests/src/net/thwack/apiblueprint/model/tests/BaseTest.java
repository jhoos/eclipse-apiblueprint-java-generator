/**
 */
package net.thwack.apiblueprint.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.thwack.apiblueprint.model.APIBlueprintModelFactory;
import net.thwack.apiblueprint.model.Base;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Base</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class BaseTest extends TestCase {

	/**
	 * The fixture for this Base test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Base fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseTest.class);
	}

	/**
	 * Constructs a new Base test case with the given name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Base test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Base fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Base test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Base getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(APIBlueprintModelFactory.eINSTANCE.createBase());
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

} // BaseTest
