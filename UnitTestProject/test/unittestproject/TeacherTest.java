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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of setCategory method, of class Teacher.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Teacher instance = new Teacher();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Teacher.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Teacher instance = new Teacher();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialty method, of class Teacher.
     */
    @Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        Teacher instance = new Teacher();
        String expResult = "";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialty method, of class Teacher.
     */
    @Test
    public void testSetSpecialty() {
        System.out.println("setSpecialty");
        String specialty = "";
        Teacher instance = new Teacher();
        instance.setSpecialty(specialty);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class Teacher.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        Teacher instance = new Teacher();
        String expResult = "";
        String result = instance.getDegree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    /**
     * Test of setDegree method, of class Teacher.
     */
    @Test
    public void testSetDegree() {
        System.out.println("setDegree");
        String degree = "";
        Teacher instance = new Teacher();
        instance.setDegree(degree);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Teacher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Teacher instance = new Teacher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Teacher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of isDean method, of class Teacher.
     */
    @Test
    public void testIsDean() {
        System.out.println("isDean");
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.isDean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDean method, of class Teacher.
     */
    @Test
    public void testSetDean() {
        System.out.println("setDean");
        boolean dean = false;
        Teacher instance = new Teacher();
        instance.setDean(dean);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
