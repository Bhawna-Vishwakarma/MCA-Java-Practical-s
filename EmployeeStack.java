import java.util.Scanner;
import java.util.Stack;

class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int deptNumber;

    public Employee(int empId, String empName, double salary, int deptNumber) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.deptNumber = deptNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDeptNumber() {
        return deptNumber;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Salary: " + salary + ", Department: " + deptNumber;
    }
}

public class EmployeeStack {
    private Stack<Employee> stack;

    public EmployeeStack() {
        stack = new Stack<>();
    }

    public void pushEmployee(Employee emp) {
        stack.push(emp);
        System.out.println("Employee pushed to stack: " + emp);
    }

    public Employee popEmployee() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        Employee emp = stack.pop();
        System.out.println("Employee popped from stack: " + emp);
        return emp;
    }

    public Employee peekEmployee() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        Employee emp = stack.peek();
        System.out.println("Employee at top of stack: " + emp);
        return emp;
    }

    public static void main(String[] args) {
        EmployeeStack empStack = new EmployeeStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push Employee");
            System.out.println("2. Pop Employee");
            System.out.println("3. Peek Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter Department Number: ");
                    int deptNumber = scanner.nextInt();
                    Employee emp = new Employee(empId, empName, salary, deptNumber);
                    empStack.pushEmployee(emp);
                    break;
                case 2:
                    empStack.popEmployee();
                    break;
                case 3:
                    empStack.peekEmployee();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
