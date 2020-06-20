package design_pattern.abstract_factory;

public class Cat implements Pet {

    @Override
    public void eat(PetFood food) {
        System.out.println("cat eat " + food.getFoodName());
    }
}
