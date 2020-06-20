package design_pattern.abstract_factory;

public abstract class AbstractFactory {
    public abstract Pet getPet(String type);
    public abstract PetFood getPetFood(String type);
}
