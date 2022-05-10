package unittestproject;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    static ArrayList<Integer> allIDs = new ArrayList<>(); //To check if same Person is being added to dept
    static ArrayList<Teacher> allDeansFromFile = new ArrayList<>();
    static  ArrayList<Teacher> allTeachersFromFile = new ArrayList<>();
     static ArrayList<Staff> allStaffFromFile = new ArrayList<>();
    static ArrayList<Department> allDepartmentCreated = new ArrayList<>();


    public static void main(String[] args) {
        readStaffFile();

        readTeacherFile();
        
     createDepartment(); //If you enter 2 for dept number, addToDept should have 2 also as argument before running the program
     addToDept(2); 
       
    }

        // Read from Teachers.txt and add every teacher to AllTeachersFromFile ArrayList
        public static void readTeacherFile() {
      File teachersFile = new File("Teachers.txt");

        try (Scanner readTeachers = new Scanner(teachersFile)) {
            while (readTeachers.hasNextLine()) {
                String row = readTeachers.nextLine();
                String[] str = row.split(" ");
                String category = str[0];
                if (category.equals("FullTimeTeacher")) {
                    int teachID = Integer.parseInt(str[1]);
                    String fName = str[2];
                    String lName = str[3];
                    String email = str[4];
                    String phone = str[5];
                    int age = Integer.parseInt(str[6]);
                    String specialty = str[7];
                    String degree = str[8];
                    Teacher teacher = new FullTimeTeacher(category, teachID, fName, lName, email, phone, age, specialty, degree);
                    FullTimeTeacher fullTime = (FullTimeTeacher) teacher;
                    allTeachersFromFile.add(fullTime);
                    String deanCheck = "";
                    try {
                     deanCheck = str[9];
                    }catch(ArrayIndexOutOfBoundsException e) { // if index 9 is out of bounds then not a dean
                        System.out.println("Not a dean");
                    }
                    if (deanCheck.equals("dean")) {
                        teacher.setDean(true);
                        allDeansFromFile.add(teacher);
                        allIDs.add(teacher.getPersonID());
                    }
                } else {
                    int teachID = Integer.parseInt(str[2]);
                    double hoursWorked = Double.parseDouble(str[1]);
                    String fName = str[3];
                    String lName = str[4];
                    String email = str[5];
                    String phone = str[6];
                    int age = Integer.parseInt(str[7]);
                    String specialty = str[8];
                    String degree = str[9];
                    Teacher teacher = new PartTimeTeacher(category,hoursWorked, teachID, fName, lName, email, phone, age,specialty,degree);
                    PartTimeTeacher partTime = (PartTimeTeacher) teacher;
                    allTeachersFromFile.add(partTime);
                }
            }

        } catch(FileNotFoundException e) {
            e.getMessage();
        }
    }

        //Read all staff members from Staff.txt and add them to allStaffFromFile ArrayList
        public static void readStaffFile() {
        File staffFile = new File("Staff.txt");
        try (Scanner readStaff = new Scanner(staffFile)) {
            while (readStaff.hasNext()) {
                String row = readStaff.nextLine();
                String[] str = row.split(" ");
                String category = str[0];
                int staffId = Integer.parseInt(str[1]);
                String fName = str[2];
                String lName = str[3];
                String email = str[4];
                String phone = str[5];
                int age = Integer.parseInt(str[6]);
                double workload = Double.parseDouble(str[7]);
                String duty = str[8];
                Staff staff = new Staff(category, staffId, fName, lName, email, phone, age, workload, duty);
                allStaffFromFile.add(staff);
            }



        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        }

    public static void createDepartment() { //Creates new department and text file for it
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your new department: ");
        String deptName = scan.nextLine();
        System.out.println("What is the ID for this department: ");
        int deptId = scan.nextInt();
        ArrayList<Staff> deptStaffList = new ArrayList<>();
        ArrayList<Teacher> deptTeacherList = new ArrayList<>();
        System.out.println("Enter the ID of the dean: ");
        int deanID = scan.nextInt();

        Teacher deanForDept = null;
        for (int i = 0; i < allDeansFromFile.size(); i++) {
            if (deanID == allDeansFromFile.get(i).getPersonID()) {
                deanForDept = allDeansFromFile.get(i);
                deanForDept.setCategory("Dean");
                Department userDept = new Department(deptId, deptName,deanForDept,deptStaffList,deptTeacherList);
                allDepartmentCreated.add(userDept);
                
            }
            }
    
        try (FileWriter fw = new FileWriter(deptName.concat(".txt"),true)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Department " + deptName);
            pw.println("Department ID " + deptId);
            pw.println(deanForDept);
            //pw.println(userDept);
            pw.close();

        }catch (IOException e) {
            e.getMessage();
        }
                
    }
    
    //Add specified Person to specified Department
    //method works when createDepartment() method is uncommented and user enters the deptNum used in CreateDepartment()
    //method can only add one staff or one teacher :(
    public static void addToDept(int deptNum) {
        Scanner s = new Scanner(System.in);
        int deptIndex = 0;
        for (int i = 0; i < allDepartmentCreated.size(); i++) {
            if (deptNum == allDepartmentCreated.get(i).getDepartmnentID()) { //Check is dept exist
               
                deptIndex = i;
                System.out.println("What is the ID of the Person you want to add: ");
                int personID = s.nextInt();
                System.out.println("Enter 1 if you're adding a Staff member or Enter 0 for adding a Teacher: ");
                int category = s.nextInt();
                for (int allid : allIDs) {
                    if (allid == personID) {
                        throw new PersonAlreadyInDeptException("Someone with this ID already exist in a department");
                    }
                }
                if (category == 1) {
                    for (Staff staff : allStaffFromFile) {
                        if (staff.getPersonID() == personID) {
                            Staff staffAdded = staff;
                            allDepartmentCreated.get(deptIndex).addToDept(staffAdded);
                            allIDs.add(staffAdded.getPersonID());
                        }
                    }
                } else if (category == 0) {
                   
                    for (Teacher teacher : allTeachersFromFile) {
                        if (teacher.getPersonID() == personID) {
                            Teacher teacherAdded = teacher;
                            allDepartmentCreated.get(deptIndex).addToDept(teacherAdded);
                            allIDs.add(teacherAdded.getPersonID());
                        }
                    }
                }            
        
            }
             else {
                throw new InvalidDepartmentException("Department does not exist");
            }
        try (FileWriter addPersons = new FileWriter(allDepartmentCreated.get(deptIndex).getDepartmentName().concat(".txt"),true)) {
            PrintWriter pw = new PrintWriter(addPersons);
            pw.println("All Staff members in this Department: ");
            pw.println(allDepartmentCreated.get(deptIndex).getStaffList());
            pw.println("-------------------------------------------------");
            pw.println("All Teachers in this Department: ");
            pw.println(allDepartmentCreated.get(deptIndex).getTeacherList());
            pw.close();
        } catch(IOException e) {
            e.getMessage();
        }

        }
    }
}
