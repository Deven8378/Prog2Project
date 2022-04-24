package Project;

public class Teacher extends Person {

    private String specialty;
    private String degree;
    private String category;

    public Teacher() {
        this.specialty = "";
        this.degree = "";
    }


    public Teacher(String category,String specialty, String degree) {
        this.specialty = specialty;
        this.degree = degree;
        this.category = category;
    }

    public Teacher(String category, String fName, String lName, String email, String phoneNo, int age, String specialty, String degree) {
        super(fName, lName, email, phoneNo, age);
        this.degree = degree;
        this.specialty = specialty;
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }


    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        String str = String.format("%-10s%-10s\n", "Teacher's Category: ", this.category);
        str += String.format("%-10s%-4d\n","Teacher's ID: ", this.getPersonID());
        str += String.format("%-10s%-20s\n","Teacher's name: ", this.getFName());
        str += String.format("%-20s%-20s\n","Teacher's Last Name: ", this.getLName());
        str += String.format("%-10s%-25s\n","Teacher's Email: ",this.getEmail());
        str += String.format("%-10s%-15s\n","Teacher's Phone No: ", this.getPhoneNo());
        str+= String.format("%-10s%-2d\n","Teacher's Age: ",this.getAge());
        str += String.format("%-10s%-15s\n","Teacher's Specialty: ", this.specialty);
        return str += String.format("%-10s%-15s\n","Teacher's Degree: ", this.degree);
    }

    
}
