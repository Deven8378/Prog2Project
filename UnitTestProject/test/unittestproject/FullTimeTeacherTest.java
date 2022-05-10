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
public class FullTimeTeacherTest {
    
    public FullTimeTeacherTest() {
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
     * Test of ComputePayRoll method, of class FullTimeTeacher.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        FullTimeTeacher instance = new FullTimeTeacher("FullTimeTeacher",1,"Deven","Patel","d12@gmail.com","514-323-5324",54,"Cs","PhD");
        double expResult = 6092.8;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FullTimeTeacher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FullTimeTeacher instance = new FullTimeTeacher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FullTimeTeacher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FullTimeTeacher instance = new FullTimeTeacher();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
