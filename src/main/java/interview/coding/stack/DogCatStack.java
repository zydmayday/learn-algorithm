package interview.coding.stack;

import interview.coding.stack.beans.Pet;
import interview.coding.stack.beans.PetType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DogCatStack<T extends Pet> {

    private Deque<InnerPet> dogStack = new ArrayDeque<>();
    private Deque<InnerPet> catStack = new ArrayDeque<>();
    transient private long count = 0;

    public void add(T pet) {
        if (pet.type().equals(PetType.CAT)) {
            catStack.push(new InnerPet(count++, pet));
        } else {
            dogStack.push(new InnerPet(count++, pet));
        }
    }

    public T poll() {
        if (isDogEmpty() && isCatEmpty()) {
            throw new NoSuchElementException();
        } else if (isCatEmpty()) {
            return dogStack.pop().getPet();
        } else if (isDogEmpty()) {
            return catStack.pop().getPet();
        } else {
            if (catStack.peek().getCount() > dogStack.peek().getCount()) {
                return catStack.pop().getPet();
            } else {
                return dogStack.pop().getPet();
            }

        }
    }

    public T pollDog() {
        return dogStack.pop().getPet();
    }

    public T pollCat() {
        return catStack.pop().getPet();
    }

    public boolean isEmpty() {
        return isCatEmpty() && isDogEmpty();
    }

    public boolean isDogEmpty() {
        return dogStack.isEmpty();
    }

    public boolean isCatEmpty() {
        return catStack.isEmpty();
    }

    class InnerPet {
        private long count;
        private T pet;

        public InnerPet(long count, T pet) {
            this.count = count;
            this.pet = pet;
        }

        public long getCount() {
            return count;
        }

        public T getPet() {
            return pet;
        }
    }

}
