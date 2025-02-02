package main.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDirectory implements Employee{
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String showDetails() {
        StringBuilder sb = new StringBuilder();
        for(Employee employee : employees) {
            sb.append(employee.showDetails());
            sb.append("\n");
        }
        return sb.toString();
    }
}
