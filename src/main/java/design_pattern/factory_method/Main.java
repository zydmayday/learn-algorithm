package design_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        AnimalFactory af = new AnimalFactory();
        Animal cat = af.getAnimal("cat");
        Animal dog = af.getAnimal("dog");

        cat.eat();
        dog.eat();
    }
}
