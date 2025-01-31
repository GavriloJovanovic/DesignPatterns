package main.java.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String notifyObservers(String message) {
        StringBuilder sb = new StringBuilder();
        for (Observer observer : observers) {
            sb.append(observer.update(message));
            sb.append("\n");
        }
        return sb.toString();
    }
}
