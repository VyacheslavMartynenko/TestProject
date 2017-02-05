package stadium;

import observer.Observer;
import observer.Subject;

import java.util.List;

public class Stadium implements Subject {
    final private String name;
    final private int capacity;
    final private List<Observer> observers;

    private Stadium(StadiumBuilder builder) {
        this.name = builder.name;
        this.capacity = builder.capacity;
        this.observers = builder.observers;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public static class StadiumBuilder {
        final private String name;
        final private int capacity;
        private List<Observer> observers;

        public StadiumBuilder(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public StadiumBuilder observers(List<Observer> observers) {
            this.observers = observers;
            return this;
        }

        public Stadium build() {
            return new Stadium(this);
        }
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
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
