package design_pattern.abstract_factory;

public class PetFoodFactory extends AbstractFactory {
    @Override
    public Pet getPet(String type) {
        return null;
    }

    @Override
    public PetFood getPetFood(String type) {
        if (type.equals("catFood")) {
            return new CatFood();
        }
        return null;
    }
}
