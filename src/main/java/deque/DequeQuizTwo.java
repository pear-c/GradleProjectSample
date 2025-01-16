package deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeQuizTwo {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> dq = new LinkedList<>();

        // 문자열의 각 자리 삽입
        for(char c : s.toCharArray()) {
            dq.offerFirst(c);
        }

        for(char c : s.toCharArray()) {
            char top = dq.pollFirst();
            if(top != c) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] tests = {
                "A man, a plan, a canal: Panama",
                "racecar",
                "123321",
                "no lemon, no melon"
        };
        for(String test : tests) {
            boolean isPalindrome = isPalindrome(test);
            System.out.println(isPalindrome);
        }
    }
}
