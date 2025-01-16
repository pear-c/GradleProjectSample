package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 임의 학번 생성
        Set<Integer> set = new HashSet<>();

        while(true) {
            int num = sc.nextInt();
            if(num < 0)
                break;

            set.add(num);
        }

        // 학번 오름차순 정렬
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);
    }
}
