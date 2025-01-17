package algorithm;

public class O1Example {
    public static void main(String[] args) {
        System.out.println("O(1) 예시: 배열 인덱스 접근");
        measurePerformance(O1Example::o1Example);
    }

    private static void o1Example() {
        // 정수형 배열 선언 및 초기화
        int[] arr = {10, 20, 30, 40, 50};

        // 접근할 배열의 인덱스 설정
        int indexToAccess = 3;  // 40

        // 10만번 반복하여 특정 인덱스 값을 읽는 연산
        for(int i=0; i<100000; i++) {
            int value = arr[indexToAccess];
        }
    }

    private static void measurePerformance(Runnable example) {
        // 시작 시간 기록
        long start = System.nanoTime();

        example.run();

        // 종료 시간 기록
        long end = System.nanoTime();

        // 실행시간 계산 후 출력
        System.out.println("소요 시간: " + (end - start) + "ns");
    }
}
