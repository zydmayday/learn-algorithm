package interview.coding.stack;

import interview.coding.stack.beans.Cat;
import interview.coding.stack.beans.Dog;
import interview.coding.stack.beans.Pet;
import interview.coding.stack.beans.PetType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogCatStackTest {

    DogCatStack<Pet> stack = new DogCatStack<>();

    @Test
    void test() {
        stack.add(new Dog("dog1"));
        stack.add(new Dog("dog2"));
        stack.add(new Cat("cat1"));
        assertEquals(PetType.DOG, stack.pollDog().type());
        assertEquals(PetType.CAT, stack.pollCat().type());
        assertFalse(stack.isDogEmpty());
        assertTrue(stack.isCatEmpty());
        assertFalse(stack.isEmpty());
        assertEquals(PetType.DOG, stack.poll().type());
        assertTrue(stack.isDogEmpty());
        assertTrue(stack.isEmpty());
    }
}
