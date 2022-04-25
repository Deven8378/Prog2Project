package Project;

public class FullTimeTeacher extends Teacher implements PayRoll {
    private int yearsWorked;

    FullTimeTeacher() {
        this.yearsWorked = 0;
    }

    FullTimeTeacher(String category, String fName, String lName, String email, String phoneNo, int age, String specialty, String degree, int yearsWorked) {
    super(category, fName, lName, email, phoneNo, age, specialty, degree);
    this.yearsWorked = yearsWorked;
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
        return payRoll = 0.85 * (32 * degreeRate * 2);
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }
    
    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s%-2d\n","Years Worked: ", this.yearsWorked);
        return str += String.format("%-15s%.2f\n","Teacher's PayRoll: ", this.ComputePayRoll());
    }

}
