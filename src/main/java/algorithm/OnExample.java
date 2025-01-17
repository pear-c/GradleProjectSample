package algorithm;

import java.util.Arrays;

public class OnExample {
    public static void main(String[] args) {
        System.out.println("O(n) 예시: 선형 검색");
        measurePerformance(OnExample::onExample);
    }

    private static void onExample() {
        // 크기가 100_000인 정수 배열 생성
        int[] arr = new int[100000];

        // 배열의 모든 요소 1로 초기화
        Arrays.fill(arr, 1);

        // 찾을 값 설정
        int target = 1;

        // 배열을 순차 탐색하여 target 값이 있는지 확인
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target)
                break;
        }
    }

    private static void measurePerformance(Runnable example) {
        long start = System.nanoTime();
        example.run();
        long end = System.nanoTime();
        System.out.println("소요 시간: " + (end - start) + " ns");
    }
}
