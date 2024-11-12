import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private char empGender;
    private int yearOfJoining;

    // Constructor
    public Employee(int empId, String empName, char empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public char getEmpGender() {
        return empGender;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // Implementing Comparable interface
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);
    }
}

class YearOfJoiningComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getYearOfJoining(), e2.getYearOfJoining());
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 'F', 2018));
        employees.add(new Employee(2, "Bob", 'M', 2020));
        employees.add(new Employee(3, "Charlie", 'M', 2015));
        employees.add(new Employee(4, "David", 'M', 2019));

        // Sorting using Comparable interface
        Collections.sort(employees);

        // Sorting using Comparator interface
        Collections.sort(employees, new YearOfJoiningComparator());

        // Print sorted employees
        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee Gender: " + emp.getEmpGender());
            System.out.println("Year of Joining: " + emp.getYearOfJoining());
            System.out.println();
        }
    }
}