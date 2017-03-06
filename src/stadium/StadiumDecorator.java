package stadium;

import observer.Observer;
import observer.Subject;

public class StadiumDecorator implements Subject {
    Subject stadium;

    StadiumDecorator(Subject stadium) {
        this.stadium = stadium;
    }

    @Override
    public void addObserver(Observer observer) {
        stadium.addObserver(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        stadium.removeObserver(observer);
    }

    @Override
    public void notifyObserver(Observer observer) {
        stadium.notifyObserver(observer);
    }

    @Override
    public void notifyObservers() {
        stadium.notifyObservers();
    }
}
