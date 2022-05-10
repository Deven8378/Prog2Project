
package unittestproject;
import java.util.ArrayList;

public class Department {
    
    protected static ArrayList<Department> departments = new ArrayList<>();
    private int departmnentID;
    private String departmentName;
    private Teacher dean;
    private  ArrayList<Staff> staffList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();

    public Department(int departmnentID,String departmentName ,Teacher dean, ArrayList<Staff> staffList, ArrayList<Teacher> teacherList) {
        this.departmentName = departmentName;
        this.dean = dean;
        this.staffList = staffList;
        this.teacherList = teacherList;
        this.departmnentID = departmnentID;
    }

    public Department(int departmnentID) {
        for (Department dep : departments) {
            if (dep.getDepartmnentID() == departmnentID) {
                throw new InvalidDepartmentException("Department with ID: " + departmnentID + " already exists");
            }
        }
        this.departmnentID = departmnentID;
        departments.add(this);
    }
  
    public void addToDept(Person p) {
        if (p instanceof Staff ) {
        Staff s = (Staff) p;
            this.staffList.add(s);
        } else if (p instanceof FullTimeTeacher || p instanceof PartTimeTeacher) {
            Teacher t = (Teacher) p;
            this.teacherList.add(t);
        }
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String deptName) {
        this.departmentName = deptName;
    }

    public int getDepartmnentID() {
        return this.departmnentID;
    }

    public void setDepartmentID(int departmnentID) {
        this.departmnentID = departmnentID;
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
         str += String.format("%-10s%-4d\n","Dept ID: ", this.departmnentID);
        str += String.format("%-10s%-20s\n","Dean's Name: ", this.dean.getFName());
      return  str += String.format("%-10s%-20s\n","Dean's Last Name: ", this.dean.getLName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Department)) {
            return false;
        }
        Department dep = (Department) o;
        if (this.dean.equals(dep.dean) && this.departmentName.equals(dep.departmentName) && this.staffList.equals(dep.staffList)
        && this.teacherList.equals(dep.teacherList) && this.departmnentID == dep.departmnentID) {
        return true;
    } else {
        return false;
        }
          
    }
}
