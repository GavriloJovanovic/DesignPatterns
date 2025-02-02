package main.java.structural.composite;

public class Manager implements Employee{
    private String name;
    private String departmant;

    public Manager(String name, String departmant) {
        this.name = name;
        this.departmant = departmant;
    }

    @Override
    public String showDetails() {
        return "Manager: " + name + ", Department: " + departmant;
    }
}
