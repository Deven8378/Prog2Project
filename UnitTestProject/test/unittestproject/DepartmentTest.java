/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestproject;


import java.util.ArrayList;
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
public class DepartmentTest {
    
    public DepartmentTest() {
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
     * Test of addToDept method, of class Department.
     */
    @Test
    public void testAddToDept() {
        System.out.println("addToDept");
        Person p = new Teacher();
        Department instance = new Department(5);
        instance.addToDept(p);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartmentName method, of class Department.
     */
    @Test
    public void testGetDepartmentName() {
        System.out.println("getDepartmentName");
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        String expResult = "MathDept";
        String result = instance.getDepartmentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartmentName method, of class Department.
     */
    @Test
    public void testSetDepartmentName() {
        System.out.println("setDepartmentName");
        String deptName = "MathDept";
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        instance.setDepartmentName(deptName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartmnentID method, of class Department.
     */
    @Test
    public void testGetDepartmnentID() {
        System.out.println("getDepartmnentID");
        Department instance = new Department(4);
        int expResult = 4;
        int result = instance.getDepartmnentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartmentID method, of class Department.
     */
    @Test
    public void testSetDepartmentID() {
        System.out.println("setDepartmentID");
        int departmentID = 10;
        Department instance = new Department(departmentID);
        instance.setDepartmentID(departmentID);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDean method, of class Department.
     */
    @Test
    public void testGetDean() {
        System.out.println("getDean");
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        Teacher expResult = dean;
        Teacher result = instance.getDean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDean method, of class Department.
     */
    @Test
    public void testSetDean() {
        System.out.println("setDean");
        Teacher dean = new Teacher();
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        instance.setDean(dean);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getStaffList method, of class Department.
     */
    @Test
    public void testGetStaffList() {
        System.out.println("getStaffList");
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        ArrayList<Staff> expResult = new ArrayList<>();
        ArrayList<Staff> result = instance.getStaffList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setStaffList method, of class Department.
     */
    @Test
    public void testSetStaffList() {
        System.out.println("setStaffList");
        ArrayList<Staff> staffList = new ArrayList<>();
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        instance.setStaffList(staffList);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherList method, of class Department.
     */
    @Test
    public void testGetTeacherList() {
        System.out.println("getTeacherList");
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        ArrayList<Teacher> expResult = new ArrayList<>();
        ArrayList<Teacher> result = instance.getTeacherList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTeacherList method, of class Department.
     */
    @Test
    public void testSetTeacherList() {
        System.out.println("setTeacherList");
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Teacher> teach = new ArrayList<>();
        ArrayList<Staff> staff = new ArrayList<>();
        Teacher dean = new Teacher();
        Department instance = new Department(4,"MathDept",dean,staff,teach);
        instance.setTeacherList(teacherList);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Department.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Department instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Department.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Department instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
