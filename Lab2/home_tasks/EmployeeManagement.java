import java.util.HashSet;
import java.util.Objects;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    // Getters and setters (optional)
}

public class EmployeeManagement {
    private HashSet<Employee> employees = new HashSet<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean isEmployeeExists(Employee employee) {
        return employees.contains(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId());
        }
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        management.addEmployee(new Employee("Alice", 123));
        management.addEmployee(new Employee("Bob", 456));
        management.addEmployee(new Employee("Alice", 123)); // Duplicate, won't be added

        management.displayEmployees();
    }
}