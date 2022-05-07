package Project;

public class Staff extends Person implements PayRoll {
    
    private double workLoad;
    private String duty;
    private String category;

    public Staff() {
        workLoad = 0.0;
        duty = "";
    }

    public Staff(double workLoad, String duty) {
        if (workLoad <=40) {
        this.workLoad = workLoad;
        } else {
            throw new WorkloadTooBigException("Workload cannot be greater than 40 hours");
        }
        this.duty = duty;
    }

    public Staff(String category,int personID,String fName, String lName, String email, String phoneNo, int age, double workLoad, String duty) {
        super(personID,category,fName, lName, email, phoneNo, age);
        if (workLoad <=40) {
            this.workLoad = workLoad;
            } else {
                throw new WorkloadTooBigException("Workload cannot be greater than 40 hours");
            }
        this.duty = duty;
    }

    @Override
    public double ComputePayRoll() {
        double payRoll = 0.75 * (this.workLoad * 32 * 2);
        return payRoll;
    }

    public double getWorkLoad() {
        return this.workLoad;
    }

    public void setWorkLoad(double workLoad) {
        if (workLoad <=40) {
            this.workLoad = workLoad;
            } else {
                throw new WorkloadTooBigException("Workload cannot be greater than 40 hours");
            }
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public void setCategory(String category) {
      this.category = category;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s%.2f\n","Staff's Workload: ", this.workLoad);
        str += String.format("%-10s%-15s\n","Staffs' Duty: ", this.duty);
        return str += String.format("%-10s%.2f\n", "Staff's PayRoll: ", this.ComputePayRoll());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) o;
        boolean result = super.equals(staff); //checks if the variables from person are the same between 2 staff members
        if (this.workLoad == staff.workLoad && this.duty == staff.duty && result == true) {
            return true;
        } else {
            return false;
        }
        
    }
}
