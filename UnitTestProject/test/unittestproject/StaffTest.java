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
public class StaffTest {
    
    public StaffTest() {
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
     * Test of ComputePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        Staff instance = new Staff("Staff",1,"Deven","Patel","dp1321@gmail.com","514-141-1843",46,33,"Janitor");
        double expResult = 1584;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkLoad method, of class Staff.
     */
    @Test
    public void testGetWorkLoad() {
        System.out.println("getWorkLoad");
        Staff instance = new Staff();
        double expResult = 0.0;
        double result = instance.getWorkLoad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkLoad method, of class Staff.
     */
    @Test
    public void testSetWorkLoad() {
        System.out.println("setWorkLoad");
        double workLoad = 0.0;
        Staff instance = new Staff();
        instance.setWorkLoad(workLoad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDuty method, of class Staff.
     */
    @Test
    public void testGetDuty() {
        System.out.println("getDuty");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getDuty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDuty method, of class Staff.
     */
    @Test
    public void testSetDuty() {
        System.out.println("setDuty");
        String duty = "";
        Staff instance = new Staff();
        instance.setDuty(duty);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Staff.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Staff instance = new Staff();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Staff.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Staff.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Staff.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Staff instance = new Staff();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
