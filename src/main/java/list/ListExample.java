package list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    static class Student {
        String name;
        int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
    public static void main(String[] args) {
        // ArrayList 생성
        List<Student> students = new LinkedList<>();

        // 학생 추가
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 72));

        // 특정 인덱스에 삽입
        students.add(1, new Student("David", 88));

        // 이름으로 검색 후 점수 변경
        for(Student student : students) {
            if(student.name.equals("Bob")) {
                student.score = 80;
            }
        }

        // 인덱스로 삭제
        students.remove(2);

        // 점수 기준으로 오름차순 정렬
        students.sort(Comparator.comparing(s -> s.score));

        // 최종 출력
        students.forEach(System.out::println);
    }
}
