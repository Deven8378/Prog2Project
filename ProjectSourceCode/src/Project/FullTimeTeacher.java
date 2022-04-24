package Project;

public class FullTimeTeacher extends Teacher implements PayRoll {

    FullTimeTeacher() {

    }

    FullTimeTeacher(String category, String fName, String lName, String email, String phoneNo, int age, String specialty, String degree) {
    super(category, fName, lName, email, phoneNo, age, specialty, degree);
    }

    @Override
    public double ComputePayRoll() {
        double payRoll = 0.0;
        final double PhDRate = 112;
        final double MasterRate = 82;
        final double BachRate = 42;
        double degreeRate = 0.0;

        if (this.getDegree() == "PhD") {
            degreeRate = PhDRate;
        } else if (this.getDegree() == "Master") {
            degreeRate = MasterRate;
        } else if (this.getDegree() == "Bachelor") {
            degreeRate = BachRate;
        }
        return payRoll = 0.85 * (32 * degreeRate * 2);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str += String.format("%-15s%.2f\n","Teacher's PayRoll: ", this.ComputePayRoll());
    }

}
