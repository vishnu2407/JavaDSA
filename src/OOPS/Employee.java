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

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee4:");
        // Create another object of Employee class
        Employee employee4 = new Employee("Vikas", 104, 80000.0);
        // Call the displayInfo() method
        employee4.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee5:");
        // Create another object of Employee class
        Employee employee5 = new Employee("Vamshi", 105, 90000.0);
        // Call the displayInfo() method
        employee5.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber

        System.out.println("Employee6:");
        // Create another object of Employee class
        Employee employee6 = new Employee("Vivek", 106, 100000.0);
        // Call the displayInfo() method
        employee6.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee7:");
        // Create another object of Employee class
        Employee employee7 = new Employee("Vijay", 107, 110000.0);
        // Call the displayInfo() method
        employee7.displayInfo();

        System.out.println("*************************************************************");

        //print the employeeSerialNumber
        System.out.println("Employee8:");
        // Create another object of Employee class
        Employee employee8 = new Employee("Geya", 108, 120000.0);
        // Call the displayInfo() method
        employee8.displayInfo();
    }
}
