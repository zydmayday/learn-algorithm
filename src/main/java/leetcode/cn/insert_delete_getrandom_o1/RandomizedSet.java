package leetcode.cn.insert_delete_getrandom_o1;

import java.util.*;

class RandomizedSet {

    private Map<Integer, Integer> map;
    private List<Integer> queue;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        queue = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            queue.add(val);
            map.put(val, queue.size() - 1);
            return true;
        } else {
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int indexOfRemoved = map.get(val);
            int indexOfLast = queue.size() - 1;
            int last = queue.get(indexOfLast);
            queue.set(indexOfRemoved, last);
            queue.remove(indexOfLast);
            map.put(last, indexOfRemoved);
            map.remove(val);
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return queue.get(new Random().nextInt(queue.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */