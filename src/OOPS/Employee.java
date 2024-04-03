package OOPS;

public class Employee {
    // Instance variables
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        //print the employeeSerialNumber
        System.out.println("Employee1:");
        // Create an object of Employee class
        Employee employee1 = new Employee("Vishnu", 101, 50000.0);
        // Call the displayInfo() method
        employee1.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee2:");
        // Create another object of Employee class
        Employee employee2 = new Employee("Vamshi", 102, 60000.0);
        // Call the displayInfo() method
        employee2.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee3:");
        // Create another object of Employee class
        Employee employee3 = new Employee("Subhash", 103, 70000.0);
        // Call the displayInfo() method
        employee3.displayInfo();

    }
}
