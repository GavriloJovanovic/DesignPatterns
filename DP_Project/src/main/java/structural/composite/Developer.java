package main.java.structural.composite;

public class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String showDetails() {
        return "Developer: " + name + ", Position: " + position;
    }
}
