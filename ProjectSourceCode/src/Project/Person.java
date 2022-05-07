package Project;

public abstract class Person {

    private int personID;
    private String fName;
    private String lName;
    private String email;
    private String phoneNo;
    private int age;
    private String category;

    public Person() {
        this.fName = "";
        this.lName = "";
        this.email = "";
        this. age = 0;
        this.category = "";
        this.personID = 0;
    }

    public Person(int personID,String category,String fName, String lName, String email, String phoneNo, int age) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.category = category;
        this.personID = personID;
    }
    
    public abstract void setCategory(String category);

    public abstract String getCategory();

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    public int getPersonID() {
        return this.personID;
    }
    
    @Override
    public String toString() {
        String str = String.format("%-10s%-4d\n","Person's ID: ",this.personID);
        str += String.format("%-10s%-15s\n", "Person's Category:", this.category);
        str += String.format("%-15%-20s%\n","Person's Name: ", this.fName);
        str += String.format("%-15s%-20s\n","Person's Last Name: ", this.lName);
        str += String.format("%-10s%-25s\n", "Person's email: ",this.email);
        str += String.format("%-10s%15s\n", "Person's Phone No: ", this.phoneNo);
        return str += String.format("%-10s%-2d\n", "Person's Age: ", this.age);
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Person p =  (Person) obj;
        if (this.personID == p.personID && this.age == p.age && this.email.equals(p.email) && this.fName.equals(p.fName) && this.lName.equals(p.lName) && this.phoneNo.equals(p.phoneNo)) {
            return true;
        }
        return false;
    
    }

    public void addToDepartment(int departmentId) {
        // 1. Find the department
        Department department = null;
        for (Department dept : Department.departments) {
            if (dept.getDepartmnentID() == departmentId) {
                department = dept;
                break;
            }
        }

        if (department == null) {
            throw new InvalidDepartmentException("Department of ID " + departmentId + " does not exist");
        }
        
        department.addToDept(this);
    }

}
