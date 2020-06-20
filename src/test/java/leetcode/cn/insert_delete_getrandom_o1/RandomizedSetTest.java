package leetcode.cn.insert_delete_getrandom_o1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomizedSetTest {
    @Test
    void test() {
        RandomizedSet rs = new RandomizedSet();
        assertTrue(rs.insert(0));
        assertTrue(rs.insert(1));
        assertTrue(rs.remove(0));
        assertTrue(rs.insert(2));
        assertTrue(rs.remove(1));
        assertEquals(2, rs.getRandom());
    }
}
