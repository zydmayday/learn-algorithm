package design_pattern.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryCreator.getFactory("animal");
        AbstractFactory petFoodFactory = FactoryCreator.getFactory("petFood");
        Pet cat = animalFactory.getPet("cat");
        PetFood catFood = petFoodFactory.getPetFood("catFood");
        cat.eat(catFood);
    }
}
