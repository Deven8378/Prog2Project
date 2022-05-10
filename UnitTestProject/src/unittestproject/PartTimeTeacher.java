package unittestproject;

public class PartTimeTeacher extends Teacher implements PayRoll {
    
    private double hoursWorked;

    public PartTimeTeacher() {
        hoursWorked = 0.0;
    }

    public PartTimeTeacher(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeTeacher(String category, double hoursWorked, int personID,String fName, String lName, String email, String phoneNo, int age, String specialty, String degree) {
        super(personID,category,fName, lName, email, phoneNo, age, specialty, degree);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double ComputePayRoll() {
        double payRoll = 0.0;
        final double PhDRate = 112;
        final double MasterRate = 82;
        final double BachRate = 42;
        double degreeRate = 0.0;

        if (this.getDegree().equals("PhD")) {
            degreeRate = PhDRate;
        } else if (this.getDegree().equals("Master")) {
            degreeRate = MasterRate;
        } else if (this.getDegree().equals("Bachelor")) {
            degreeRate = BachRate;
        }
       return payRoll = 0.76 * (this.hoursWorked * degreeRate * 2);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-15s%.1f\n","Teacher's Hours Worked: ", this.hoursWorked);
        return str += String.format("%-15s%.2f\n","Teacher's PayRoll: ", this.ComputePayRoll());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PartTimeTeacher)) {
            return false;
        }
        PartTimeTeacher p = (PartTimeTeacher) o;
        boolean result = super.equals(p);
        if (this.hoursWorked == p.hoursWorked && result == true) {
            return true;
        } else {
            return false;
        }
    }

}


