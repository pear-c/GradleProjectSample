package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQuiz {
    static class Customer {
        String name;
        int arrivalTime;
        int serviceTime;

        public Customer(String name, int arrivalTime, int serviceTime) {
            this.name = name;
            this.arrivalTime = arrivalTime;
            this.serviceTime = serviceTime;
        }
    }



    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        queue.offer(new Customer("C1", 0, 3));
        queue.offer(new Customer("C2", 1, 2));
        queue.offer(new Customer("C3", 2, 1));

        int currentTime = 0;

        while (!queue.isEmpty()) {
            Customer front = queue.poll();
            // 현재시간 < 손님 도착 -> 그 시각까지 대기
            if(currentTime < front.serviceTime) {
                currentTime = front.serviceTime;
            }
            int start = currentTime;
            int end = currentTime + front.serviceTime;
            System.out.println(front.name + " 시작=" + start + "분, 종료=" + end);
            currentTime = end;
        }
    }

}
