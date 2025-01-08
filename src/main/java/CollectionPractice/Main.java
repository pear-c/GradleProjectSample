package CollectionPractice;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        /**
         * 1) ArrayList
         * 1.1) LinkedList
         * 2) HashSet
         * 2.1) TreeSet
         * 3) HashMap
         * 3.1) TreeMap
         */

        // 1.ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Charlie");
        arrayList.add("Bob");
        arrayList.add("Gray");
        arrayList.add(1, "David"); // 중간삽입
        System.out.println("ArrayList 특정 요소 접근: " + arrayList.get(2)); //인덱스 접근
        arrayList.remove("Bob"); // 요소 삭제
        System.out.println("ArrayList: " + arrayList);
        // - 내부적으로 동적 크기 배열로 동작
        // - 데이터를 순서대로 저장하고, 순서대로 꺼낼 수 있음
        // - 데이터를 중간에 추가하거나 삭제하면 시간이 더 걸림
        // - 데이터를 빠르게 찾을 수 있음 (리스트에서 데이터의 위치를 알면 바로 접근 가능)

        // 1.1 LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Charlie");
        linkedList.add("Bob");
        linkedList.add("Gray");
        linkedList.add(1, "David"); // 중간 삽입
        System.out.println("LinkedList 특정 요소 접근 (순차탐색) " + linkedList.get(2));
        linkedList.remove("Gray"); // 요소 삭제
        System.out.println("LinkedList: " + linkedList);
        // - 데이터를 순서대로 저장, 순서대로 출력
        // - 중간에 데이터를 삽입하거나 삭제하는데 유리
        // - 특정 요소를 찾거나 접근할 때 시간이 더 걸릴 수 있음

        // 2.1 HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Charlie");
        hashSet.add("Bob");
        hashSet.add("Gray");
        hashSet.add("Bob"); // 중복 데이터 추가 시 무시
        hashSet.add("Alice"); // 정상 추가
        System.out.println("HashSet에 포함 여부 확인 (Gray)" + hashSet.contains("Gray"));
        // - 데이터 중복을 허용하지 않음
        // - 데이터의 순서를 보장하지 않음
        // - 데이터를 빠르게 추가, 삭제, 검색

        // 2.2 TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Charlie");
        treeSet.add("Bob");
        treeSet.add("Gray");
        treeSet.add("Bob"); // 중복 데이터 추가 시 무시
        treeSet.add("Alice");
        treeSet.remove("Charlie");
        System.out.println("TreeSet: " + treeSet);
        // - 데이터 중복을 허용하지 않음
        // - 데이터가 항상 정렬된 상태로 저장
        // - 데이터를 추가하거나 삭제할 때 정렬 작업으로 인해 느릴 수 있음

        // 3.1 HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Charlie");
        hashMap.put(102, "Bob");
        hashMap.put(103, "Gray");
        hashMap.put(102, "Alice"); // 동일 키를 찾아 value를 업데이트
        System.out.println("HashMap 특정 키 접근 (102): " + hashMap.get(102));
        hashMap.remove(101);
        System.out.println("HashMap: " + hashMap);
        // - 데이터를 키와 값으로 저장
        // - 키는 중복되지 않지만, 동일 키 입력 시 값이 덮어씀
        // - 데이터를 저장하거나 검색하는 속도가 빠름

        // 3.2 TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(103, "Gray");
        treeMap.put(102, "Bob");
        treeMap.put(101, "Charlie");
        treeMap.put(102, "Alice"); // 동일 키 업데이트
        System.out.println("TreeMap 특정 키 접근(102): " + treeMap.get(102));
        treeMap.put(104, "Ayden"); // 데이터 추가
        System.out.println("TreeMap (키 정렬): " + treeMap);
        treeMap.remove(103);
        System.out.println("TreeMap: " + treeMap);
        // - 데이터를 키와 값으로 저장하며, 키를 기준으로 정렬
        // - 키는 중복 안됨
        // - 데이터를 저장하거나 검색하는 속도가 느림 -> 자동 정렬 기능 때문에
    }
}
