package ASSIGNMENT;
import java.util.*;

public class Employee {

    private String name;
    public int employeeid;
    public double wage;
    public boolean fullTime;

    Scanner sc = new Scanner(System.in);

    public Employee(String myName, int myEmployeeid, double myWage, boolean isFullTime) {
        name = myName;
        employeeid = myEmployeeid;
        wage = myWage;
        fullTime = isFullTime;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int newEmployeeid) {
        this.employeeid = newEmployeeid;
    }

    public void printDetails(boolean choice) {
        if (choice == true) {
            System.out.println(
                    "The name of the employee is " + name + ". The employee id is " + employeeid
                            + ". The wage of the employee is " + wage + " per hour. The employee is fulltime.");
        } else if (choice == false) {
            System.out.println(
                    "The name of the employee is " + name + ". The employee id is " + employeeid
                            + ". The wage of the employee is " + wage + " per hour. The employee is not fulltime.");
        } else {
            System.out.println(" Please, Enter Proper Value of Time.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Employee Id : ");
        int employeeid = sc.nextInt();
        System.out.print("Enter Your Wage : ");
        double wage = sc.nextDouble();
        System.out.print("Enter True if You are FullTime Employee, Otherwise Enter False : ");
        boolean fullTime = sc.nextBoolean();

        Employee e1 = new Employee(name, employeeid, wage, fullTime);

        e1.printDetails(fullTime);

    }
}