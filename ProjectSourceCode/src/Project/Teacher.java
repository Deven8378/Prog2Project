package Project;

public class Teacher extends Person {

    private String specialty;
    private String degree;
    private String category;
    private boolean dean;

    public Teacher() {
        this.specialty = "";
        this.degree = "";
    }


    public Teacher(String specialty, String degree) {
        this.specialty = specialty;
        this.degree = degree;
    }

    public Teacher(int personID,String category,String fName, String lName, String email, String phoneNo, int age, String specialty, String degree) {
        super(personID,category,fName, lName, email, phoneNo, age);
        this.degree = degree;
        this.specialty = specialty;
    
    }
    
    @Override
    public void setCategory(String category) {
      this.category = category;
    }

    @Override
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
        String str = String.format("%-10s%-4d\n","Teacher's ID: ", this.getPersonID());
        str = String.format("%-10s%-10s\n", "Category: ", this.category);
        str += String.format("%-10s%-20s\n","Teacher's name: ", this.getFName());
        str += String.format("%-20s%-20s\n","Teacher's Last Name: ", this.getLName());
        str += String.format("%-10s%-25s\n","Teacher's Email: ",this.getEmail());
        str += String.format("%-10s%-15s\n","Teacher's Phone No: ", this.getPhoneNo());
        str+= String.format("%-10s%-2d\n","Teacher's Age: ",this.getAge());
        str += String.format("%-10s%-15s\n","Teacher's Specialty: ", this.specialty);
        str += String.format("%-10s%-15s\n","Teacher's Degree: ", this.degree);
        return str += String.format("%-10s%-3s\n","Is Dean: ", this.isDean());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Teacher)) {
            return false;
        }
        Teacher t = (Teacher) o;
        boolean result = super.equals(t);
        if (this.specialty.equals(t.specialty) && this.degree.equals(t.degree) && result == true) {
            return true; //if all variables from Person and Teacher variables are the same between 2 teacher objects
        } else {
            return false;
        }
    }

      //Only Full Time Teachers can be dean since it's a prestigious position
      public boolean isDean() {
        return dean;
    }

    public void setDean(boolean dean) {
        this.dean = dean;
    }

}
