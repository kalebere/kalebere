import java.util.Scanner;  //java.util package is imported to use scanner class to get input from user 

class Employee {           //then we created a class named Employee
    String firstName;      // in that class we declared 3 instance variable
    String lastName;
    double monthlySalary;   // double is used to store 64 bit floating point numbers

    Employee(String f, String l, double salary) {  //then we created a constructor to initialize the instance variable
        firstName = f;                             // we assigned f value to the first name 
        lastName = l;                              // the  we assigned l value to the last name 

        if (salary > 0)                            // then we checked if the salary is greater than 0 or not by if else 
            monthlySalary = salary;                //if it is greater than 0 then we assigned salary value to monthly salary
        else                                       //if it is not greater than 0 then we will assume it as 0
            monthlySalary = 0.0;
    }

    double yearlySalary() {                        //here we just calculating monthly salary
        return monthlySalary * 12;
    }
}

public class EmployeeTest {                        //then we created another class named EmployeeTest
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);       // we created scanner object to get input from user

        System.out.println("Enter first name:");  // then we asked user to enter first name
        String f1 = sc.next();                      // we stored the first name in f1 variable

        System.out.println("Enter last name:");  // then we asked user to enter last name
        String l1 = sc.next();                      // we stored the last name in l1 variable

        System.out.println("Enter monthly salary:");
        double s1 = sc.nextDouble();

        System.out.println("\nEnter first name:");
        String f2 = sc.next();

        System.out.println("Enter last name:");
        String l2 = sc.next();

        System.out.println("Enter monthly salary:");
        double s2 = sc.nextDouble();

        Employee e1 = new Employee(f1, l1, s1);
        Employee e2 = new Employee(f2, l2, s2);

        System.out.println("\nYearly Salary:");
        System.out.println("Employee 1: " + e1.yearlySalary());
        System.out.println("Employee 2: " + e2.yearlySalary());

        e1.monthlySalary = e1.monthlySalary * 1.10;
        e2.monthlySalary = e2.monthlySalary * 1.10;

        System.out.println("\nAfter 10% Increment:");
        System.out.println("Employee 1: " + e1.yearlySalary());
        System.out.println("Employee 2: " + e2.yearlySalary());

        sc.close();
    }
}