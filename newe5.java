1)employee
  import java.util.Scanner;
class Person {
    String name;
    int age;
    void getDetails(Scanner sc)
    {
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }

    void showDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    double basicSalary;
    double hra;
    double da;

    void setSalary(Scanner sc) {
        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        hra = 0.2 * basicSalary;
        da = 0.1 * basicSalary;
    }

    double calculateSalary() {
        return basicSalary + hra + da;
    }

    void displaySalary() {
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

public class SalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.getDetails(sc);
        emp.setSalary(sc);
        System.out.println("\nEmployee Details:");
        emp.showDetails();
        emp.displaySalary();

        sc.close();
    }
}
------------------------------------------------------------

2)
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int mark1, mark2, mark3;


    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = sc.nextInt();
    }

   
    void displayResult() {
        int total = mark1 + mark2 + mark3;
        float average = total / 3f;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getDetails();
        s1.displayResult();
    }
}

3)
import java.util.Scanner;

class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    void showBalance() {
        System.out.println("Balance amount is: ₹" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        account.withdraw(wd);

        account.showBalance();
    }
}
