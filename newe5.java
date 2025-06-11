1)employee
  import java.util.Scanner;
class Person {
    String name;
    int age;
    void getDetails(Scanner sc)
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
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
