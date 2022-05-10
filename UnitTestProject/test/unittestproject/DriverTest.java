/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deven
 */
public class DriverTest {
    
    public DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Driver.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Driver.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of readTeacherFile method, of class Driver.
     */
    @Test
    public void testReadTeacherFile() {
        System.out.println("readTeacherFile");
        Driver.readTeacherFile();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of readStaffFile method, of class Driver.
     */
    @Test
    public void testReadStaffFile() {
        System.out.println("readStaffFile");
        Driver.readStaffFile();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of createDepartment method, of class Driver.
     */
    @Test
    public void testCreateDepartment() {
        System.out.println("createDepartment");
        Driver.createDepartment();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addToDept method, of class Driver.
     */
    @Test
    public void testAddToDept() {
        System.out.println("addToDept");
        int deptNum = 1;
        Driver.addToDept(deptNum);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
