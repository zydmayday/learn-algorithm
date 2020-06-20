package design_pattern.abstract_factory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "animal":
                return new PetFactory();
            case "petFood":
                return new PetFoodFactory();
            default:
                return null;
        }
    }
}
