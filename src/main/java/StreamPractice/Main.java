package StreamPractice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Christine");

        // 1. map() -> 데이터를 변환해서 새로운 형태로 변환
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 2. filter() -> 조건에 맞는 요소만 걸러냄
        names.stream()
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 3. reduce() -> 모든 요소를 결합해서 하나의 결과를 생성
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // 4. collect() -> 결과를 특정 컬렉션으로 반환
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());  // 결과를 리스트로 반환
        System.out.println("Long names: " + longNames);

        // distinct() -> 중복 요소 제거
        List<String> duplicateNames = Arrays.asList("alice", "bob", "alace", "chris", "charles", "bob");
        duplicateNames.stream()
                .distinct()
                .forEach(System.out::println);

        // 6. sorted() -> 정렬
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // 7. limit() -> 스트림의 최대 요소 수 제한
        numbers.stream()
                .limit(3) // 처음 3개 요소만 가져오기
                .forEach(System.out::println);

        // 8. skip() -> 스트림 처음 n개 요소 건너뛰기
        numbers.stream()
                .skip(2) // 처음 2개 요소 건너뛰기
                .forEach(System.out::println);

        // 9. flatMap() -> 중첩 구조를 단일 구조로 펼치기
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "mango")
        );
        nestedList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        // 10. anyMatch() -> 조건을 만족하는 요소가 하나라도 있는지 확인
        boolean hasLongName = names.stream()
                .anyMatch(name -> name.length() > 5);
        System.out.println("Has long name > 5: " + hasLongName);

        // 11. allMatch() -> 모든 요소가 조건을 만족하는지 확인
        boolean allShortNames = names.stream()
                .allMatch(name -> name.length() > 5);
        System.out.println("All names are shorter than 10?: " + allShortNames);


        // nonMatch() -> 조건을 만족하는 요소가 하나도 없는지 확인
        boolean noNameStartWithZ = names.stream()
                .noneMatch(name -> name.startsWith("z")); // "z"로 시작하는 이름이 없는지 확인
        System.out.println("there's no name start with 'z'?: " + noNameStartWithZ);


    }
}