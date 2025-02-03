package main.java.creational.abstract_factory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox paint...");
    }
}
