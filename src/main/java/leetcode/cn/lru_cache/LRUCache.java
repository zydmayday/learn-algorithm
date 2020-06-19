package leetcode.cn.lru_cache;

import java.util.*;

public class LRUCache {

    private class Node {
        public Node(int key, int used) {
            this.key = key;
            this.used = used;
        }

        int key;
        int used;
    }

    private int capacity;
    PriorityQueue<Node> cacheQueue;
    Map<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheQueue = new PriorityQueue<>((n1, n2) -> n2.used - n1.used);
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (cacheQueue.size() >= capacity) {
            cacheQueue.add(new Node(key, 0));
        }
        cache.put(key, value);
        System.out.println(cacheQueue);
        System.out.println(cache);
    }
}
