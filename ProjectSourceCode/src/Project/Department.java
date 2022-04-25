
package Project;
import java.util.ArrayList;
public class Department {
    
    private static int departmnentID = 2000;
    private String departmentName;
    private Teacher dean;
    private  ArrayList<Staff> staffList;
    private ArrayList<Teacher> teacherList;

    public Department(String departmentName ,Teacher dean, ArrayList<Staff> staffList, ArrayList<Teacher> teacherList) {
        this.departmentName = departmentName;
        this.dean = dean;
        this.staffList = staffList;
        this.teacherList = teacherList;
        Department.departmnentID++;
    }
    
    public Department() {
        this.departmentName = "";
        this.dean = null;
        this.staffList = null;;
        this.teacherList = null;
    }
    
    public void addStaff(Staff staff) {
        this.staffList.add(staff);
    }
    
    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public static int getDepartmnentID() {
        return departmnentID;
    }

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    
    @Override
    public String toString() {
        String str = String.format("%-10s%-10s\n", "Dept Name: ", this.departmentName);
        str += String.format("%-10s%-4d\n","Dept ID: ", Department.departmnentID);
        str += String.format("%-10s%-20s\n","Dean's Name: ", this.dean.getFName());
        str += String.format("%-10s%-20s\n","Dean's Name: ", this.dean.getLName());
        str += String.format("%-10s%-15s\n","Teacher List: ", this.teacherList);
        return str += String.format("%-10s%-15s\n", "Staff List:", this.staffList);
                
    }
    
    
    
}
