package leetcode.cn.lru_cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    @Test
    void test() {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1,cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        assertEquals(-1, cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        assertEquals(-1, cache.get(1));       // 返回 -1 (未找到)
        assertEquals(3, cache.get(3));       // 返回  3
        assertEquals(4, cache.get(4));       // 返回  4
    }
}
