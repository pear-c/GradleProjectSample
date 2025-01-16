package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQuiz {
    public static boolean isPalindrome(String str) {
        // 소문자로 변환
        str = str.toLowerCase();

        // Deque 생성
        Deque<Character> dq = new ArrayDeque<>();

        // 문자열의 각 문자 삽입
        for(char c : str.toCharArray()) {
            dq.offerLast(c);
        }

        // 앞, 뒤에서 문자를 꺼내 비교
        while(dq.size() > 1) {
            // 앞 문자
            char front = dq.pollFirst();
            // 뒤 문자
            char back = dq.pollLast();
            if(front != back) {
                return false;
            }
        }
        return true;
    }
}
