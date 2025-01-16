package map;

public class Student implements Comparable<Student> {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 현재 객체의 id가 작으면 음수 반환 -> 현재 객체가 앞에 위치
    // 현재 객체의 id가 같으면 양수 반환 -> 현재 객체가 뒤에 위치
    // 두 객체의 id가 같으면 0 반환
    @Override
    public int compareTo(Student o) {
        return this.id - o.id;  // id의 오름차순 정렬
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}
