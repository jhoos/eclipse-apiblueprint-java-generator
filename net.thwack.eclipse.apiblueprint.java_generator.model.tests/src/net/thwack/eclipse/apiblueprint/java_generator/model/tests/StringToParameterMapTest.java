/**
 */
package net.thwack.eclipse.apiblueprint.java_generator.model.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelFactory;
import net.thwack.eclipse.apiblueprint.java_generator.model.APIBlueprintModelPackage;
import net.thwack.eclipse.apiblueprint.java_generator.model.Parameter;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>String To Parameter Map</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class StringToParameterMapTest extends TestCase {

	/**
	 * The fixture for this String To Parameter Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, Parameter> fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringToParameterMapTest.class);
	}

	/**
	 * Constructs a new String To Parameter Map test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringToParameterMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String To Parameter Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, Parameter> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String To Parameter Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, Parameter> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, Parameter>) APIBlueprintModelFactory.eINSTANCE
				.create(APIBlueprintModelPackage.Literals.STRING_TO_PARAMETER_MAP));
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

} // StringToParameterMapTest
