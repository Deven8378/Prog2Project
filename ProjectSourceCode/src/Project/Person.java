package Project;

public abstract class Person {

    private static int personID = 1000;
    private String fName;
    private String lName;
    private String email;
    private String phoneNo;
    private int age;
    
    public Person() {
        this.fName = "";
        this.lName = "";
        this.email = "";
       this. age = 0;
        Person.personID++;
    }

    public Person(String fName, String lName, String email, String phoneNo, int age) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        Person.personID++;
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

    public int getPersonID() {
        return Person.personID;
    }

    public String toString() {
        String str = String.format("%-10s%-10s\n","Person's Category: ", this.getCategory());
        str = String.format("%-10s%-4d\n","Person's ID: ",Person.personID);
        str += String.format("%-10%-20s%\n","Person's Name: ", this.fName);
        str += String.format("%-15s%-20s\n","Person's Last Name: ", this.lName);
        str += String.format("%-10s%-25s\n", "Person's email: ",this.email);
        str += String.format("%-10s%15s\n", "Person's Phone No: ", this.phoneNo);
        return str += String.format("%-10s%-2d\n", "Person's Age: ", this.age);
    }
        
    

    
}
