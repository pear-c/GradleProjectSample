package map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;

public class MapQuiz {
    public static void main(String[] args) throws Exception {
        // 사용자 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] words = Arrays.copyOfRange(input, 0, input.length);

        // 빈도 수 계산 -> HashMap 이용 카운트
        Map<String, Integer> freqMap = new HashMap<>();
        for(String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // 단어 기준 정렬
        Map<String, Integer> sortedMap = new TreeMap<>(freqMap);

        // 출력 -> 키 알파벳 순서로 출력
        System.out.println("단어 빈도 (알파벳 순): ");
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 가장 빈도 높은 단어
        int maxFrequency = Collections.max(sortedMap.values());

        // 빈도 동일한 단어 찾기
        List<String> mostFrequentWords = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == maxFrequency) {
                mostFrequentWords.add(entry.getKey());
            }
        }

        // 가장 빈도 높은 단어를 횟수와 함께 출력
        Collections.sort(mostFrequentWords);
        System.out.println("가장 빈도가 높은 단어: " + mostFrequentWords);
    }
}
