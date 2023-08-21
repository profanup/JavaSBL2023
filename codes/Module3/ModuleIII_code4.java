/* Problem Statement : An employee works in a particular department of an
organization. Every employee has an employee number, name and draws a 
particular salary. Every department has a name and a head of department. 
The head of department is an employee. Every year a new head of department 
takes over.  Also, every year an employee is given an annual salary enhancement. 
Identify and design the classes for the above description with suitable
instance variables and methods. The classes should be such that they implement 
information hiding. You must give logic in support of your design. 
Also create two objects of each class.

*/

class Employee {
    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void applySalaryEnhancement(double percentage) {
        salary *= (1 + percentage / 100);
    }

    @Override
    public String toString() {
        return "Employee " + empNumber + ": " + name + ", Salary: " + salary+ ", Belongs to: "+department;
    }
}

class Department {
    private String name;
    private Employee headOfDepartment;

    public Department(String name, Employee headOfDepartment) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
    }

    public String getName() {
        return name;
    }

    public Employee getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Employee newHead) {
        headOfDepartment = newHead;
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Head: " + headOfDepartment.getName();
    }
}

class Organization {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee(101, "John Doe", 50000,"Sales");
        Employee employee2 = new Employee(102, "Jane Smith", 60000,"Marketing");

        // Create two Department objects
        Department department1 = new Department("Sales", employee1);
        Department department2 = new Department("Marketing", employee2);

        // Print employee and department information
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(department1);
        System.out.println(department2);
    }
}

