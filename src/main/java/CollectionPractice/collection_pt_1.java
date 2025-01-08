package CollectionPractice;

import java.util.*;

public class collection_pt_1 {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","banana","apple","pineapple","banana","mango","berry","apple","banana"};

        // 중복 제거
        Set<String> fruitset = new HashSet<>(Arrays.asList(fruits));
        System.out.println("초기 과일 데이터: " + fruitset);

        // 각 단어 등장횟수 계산
        Map<String, Integer> wordCount = new HashMap<>();
        for(String fruit : fruits) {
            wordCount.put(fruit, wordCount.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("words showing count: " + wordCount);

        // 등장 횟수 기준으로 정렬
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCount.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());
        System.out.println("order by showing count: " + sortedEntries);
    }
}
