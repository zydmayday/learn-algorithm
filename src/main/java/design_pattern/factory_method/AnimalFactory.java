package design_pattern.factory_method;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                return null;
        }
    }
}
