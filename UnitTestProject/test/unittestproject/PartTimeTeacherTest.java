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
public class PartTimeTeacherTest {
    
    public PartTimeTeacherTest() {
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
     * Test of getHoursWorked method, of class PartTimeTeacher.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        PartTimeTeacher instance = new PartTimeTeacher();
        double expResult = 0.0;
        double result = instance.getHoursWorked();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursWorked method, of class PartTimeTeacher.
     */
    @Test
    public void testSetHoursWorked() {
        System.out.println("setHoursWorked");
        double hoursWorked = 0.0;
        PartTimeTeacher instance = new PartTimeTeacher();
        instance.setHoursWorked(hoursWorked);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ComputePayRoll method, of class PartTimeTeacher.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        PartTimeTeacher instance = new PartTimeTeacher("PartTimeTeacher",30,1,"Deven","Patel","dp@gmail.com","514-235-6425",23,"Computers","Master");
        double expResult = 3739.2;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PartTimeTeacher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PartTimeTeacher instance = new PartTimeTeacher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PartTimeTeacher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PartTimeTeacher instance = new PartTimeTeacher();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
