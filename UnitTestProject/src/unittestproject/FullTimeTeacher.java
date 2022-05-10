package unittestproject;

public class FullTimeTeacher extends Teacher implements PayRoll {

    private boolean dean;

    FullTimeTeacher() {
    }

    FullTimeTeacher(String category,int personID, String fName, String lName, String email, String phoneNo, int age, String specialty, String degree) {
    super(personID,category,fName, lName, email, phoneNo, age, specialty, degree);
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

 @Override
    public String toString() {
        String str = super.toString();
        return str += String.format("%-15s%.2f\n","Teacher's PayRoll: ", this.ComputePayRoll());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FullTimeTeacher)) {
            return false;
        }
        FullTimeTeacher f = (FullTimeTeacher) o;
        boolean result = super.equals(f);
         if (result == true) {
            return true;
        } else {
            return false;
        }
    }

}
