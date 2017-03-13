package cook;

public class Cooker {
    private DrinkMaker drinkMaker;
    private PizzaMaker pizzaMaker;
    private SnackMaker snackMaker;

    public Cooker() {
        drinkMaker = new DrinkMaker();
        pizzaMaker = new PizzaMaker();
        snackMaker = new SnackMaker();
    }

    public void makeDrinks() {
        drinkMaker.makeDrinks();
    }

    public void makePizza() {
        pizzaMaker.makePizza();
    }

    public void makeSnacks() {
        snackMaker.makeSnakcs();
    }
}
