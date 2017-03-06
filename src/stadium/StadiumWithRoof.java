package stadium;

import observer.Subject;

public class StadiumWithRoof extends StadiumDecorator {

    public StadiumWithRoof(Subject stadium) {
        super(stadium);
    }

    @Override
    public void notifyObservers() {
        stadium.notifyObservers();
        closeRoof();
    }

    private void closeRoof() {
        System.out.println("Roof is closed now.");
    }
}
