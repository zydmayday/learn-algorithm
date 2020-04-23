package interview.coding.stack.beans;

public class Cat implements Pet {

    private PetType type = PetType.CAT;
    private String name;

    public Cat(String name) {
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
