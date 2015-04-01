package com.sidlors.daos.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.sidlors.daos.RolDAO;
import com.sidlors.daos.impl.RolDAOImpl;
import com.sidlors.entities.Rol;

import junit.framework.TestCase;

/**
 * The class <code>RolDAOImplTest</code> contains tests for the class {@link
 * <code>RolDAOImpl</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 29/03/15 11:28 AM
 *
 * @author juanmanuel
 *
 * @version $Revision$
 */
public class RolDAOImplTest extends TestCase {

	
	
	private static final Logger out = Logger.getLogger(RolDAOImplTest.class);


	
	private RolDAO daoRol;  
	/**
	 * Construct new test instance
	 *
	 * @param name the test name
	 */
	public RolDAOImplTest(String name) {
		super(name);
	}
	
	@Before
	public void StartUp(){
		daoRol =new RolDAOImpl();
		
	}
	
	@Test
	public void findAllTest(){
		
		for(Rol rol: daoRol.findAll())
			out.info("Rol: "+rol.getId()+" Nombre: "+rol.getName()+" Descripcion: "+rol.getDescription());
		
	}
}

/*$CPS$ This comment was generated by CodePro. Do not edit it.
 * patternId = com.instantiations.assist.eclipse.pattern.testCasePattern
 * strategyId = com.instantiations.assist.eclipse.pattern.testCasePattern.junitTestCase
 * additionalTestNames = 
 * assertTrue = false
 * callTestMethod = true
 * createMain = false
 * createSetUp = false
 * createTearDown = false
 * createTestFixture = false
 * createTestStubs = false
 * methods = 
 * package = com.sidlors.daos.test
 * package.sourceFolder = jee-jpa/src/main/java
 * superclassType = junit.framework.TestCase
 * testCase = RolDAOImplTest
 * testClassType = com.sidlors.daos.impl.RolDAOImpl
 */