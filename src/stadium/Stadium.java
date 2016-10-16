package stadium;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Stadium implements Subject {
    List<Observer> observers;

    public Stadium() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.update();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
