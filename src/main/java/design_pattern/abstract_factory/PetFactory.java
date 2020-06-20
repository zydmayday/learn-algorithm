package design_pattern.abstract_factory;

public class PetFactory extends AbstractFactory {
    @Override
    public Pet getPet(String type) {
        if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }

    @Override
    public PetFood getPetFood(String type) {
        return null;
    }
}
