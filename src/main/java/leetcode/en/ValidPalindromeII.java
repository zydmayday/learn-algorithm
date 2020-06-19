package leetcode.en;

// https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int L = s.length();
        int head = 0;
        int tail = L - 1;
        while (head < tail) {
            char a = s.charAt(head);
            char b = s.charAt(tail);
            if (a != b) {
                return valid(s, head + 1, tail) || valid(s, head, tail - 1);
            } else {
                head++;
                tail--;
            }
        }
        return true;
    }

    private boolean valid(String s, int head, int tail) {
        while (head < tail) {
            char a = s.charAt(head);
            char b = s.charAt(tail);
            if (a != b) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII solution = new ValidPalindromeII();
        System.out.println(solution.validPalindrome("aba"));
        System.out.println(solution.validPalindrome("acba"));
        System.out.println(solution.validPalindrome("abcba"));
        System.out.println(solution.validPalindrome("absccba"));
    }
}
