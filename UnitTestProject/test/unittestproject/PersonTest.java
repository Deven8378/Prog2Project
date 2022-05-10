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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of setCategory method, of class Person.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Person instance = new PersonImpl();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Person.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFName method, of class Person.
     */
    @Test
    public void testGetFName() {
        System.out.println("getFName");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getFName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFName method, of class Person.
     */
    @Test
    public void testSetFName() {
        System.out.println("setFName");
        String fName = "";
        Person instance = new PersonImpl();
        instance.setFName(fName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLName method, of class Person.
     */
    @Test
    public void testGetLName() {
        System.out.println("getLName");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getLName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setLName method, of class Person.
     */
    @Test
    public void testSetLName() {
        System.out.println("setLName");
        String lName = "";
        Person instance = new PersonImpl();
        instance.setLName(lName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Person instance = new PersonImpl();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNo method, of class Person.
     */
    @Test
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getPhoneNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNo method, of class Person.
     */
    @Test
    public void testSetPhoneNo() {
        System.out.println("setPhoneNo");
        String phoneNo = "";
        Person instance = new PersonImpl();
        instance.setPhoneNo(phoneNo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new PersonImpl();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Person instance = new PersonImpl();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonID method, of class Person.
     */
    @Test
    public void testSetPersonID() {
        System.out.println("setPersonID");
        int personID = 0;
        Person instance = new PersonImpl();
        instance.setPersonID(personID);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonID method, of class Person.
     */
    @Test
    public void testGetPersonID() {
        System.out.println("getPersonID");
        Person instance = new PersonImpl();
        int expResult = 0;
        int result = instance.getPersonID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Person.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Person instance = new PersonImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addToDepartment method, of class Person.
     */
    @Test
    public void testAddToDepartment() {
        System.out.println("addToDepartment");
        int departmentId = 0;
        Person instance = new PersonImpl();
        instance.addToDepartment(departmentId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PersonImpl extends Person {

        public void setCategory(String category) {
        }

        public String getCategory() {
            return "";
        }
    }
    
}
