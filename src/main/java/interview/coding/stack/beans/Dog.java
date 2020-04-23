package interview.coding.stack.beans;

public class Dog implements Pet {

    private PetType type = PetType.DOG;
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public PetType type() {
        return type;
    }
}
