package creation;

public class FactoryCreator {
    public AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case NORMAL:
                return new NormalTypeFactory();
            case AGGRESSIVE:
                return new AggressiveTypeFactory();
            default:
                return null;
        }
    }
}
