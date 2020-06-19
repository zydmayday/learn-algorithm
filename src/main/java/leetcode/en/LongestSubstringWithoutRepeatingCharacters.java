package leetcode.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Integer.max;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int head = 0;
        int maxLength = 0;
        for (int tail = 0; tail < s.length(); tail++) {
            while (set.contains(s.charAt(tail))) {
                set.remove(s.charAt(head++));
            }
            set.add(s.charAt(tail));
            maxLength = max(maxLength, set.size());
        }
        return max(maxLength, set.size());
    }

    public int mapVersion(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int tail = 0, head = 0; tail < s.length(); tail++) {
            if (map.containsKey(s.charAt(tail))) {
                head = max(head, map.get(s.charAt(tail)) + 1);
            }
            map.put(s.charAt(tail), tail);
            maxLength = max(maxLength, tail - head + 1);
        }
        return maxLength;
    }
}
