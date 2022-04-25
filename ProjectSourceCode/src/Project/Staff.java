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
            System.out.println("Workload Cannot Exceed 40 Hours.");
        }
        this.duty = duty;
    }

    public Staff(String fName, String lName, String email, String phoneNo, int age, double workLoad, String duty) {
        super(fName, lName, email, phoneNo, age);
        if (workLoad <=40) {
            this.workLoad = workLoad;
            } else {
                System.out.println("Workload Cannot Exceed 40 Hours.");
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
                System.out.println("Workload Cannot Exceed 40 Hours.");
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
    
}
