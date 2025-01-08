package CollectionPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collection_pt_2 {
    public static void main(String[] args) {
        // 학번과 점수 리스트 세팅
        Map<Integer, List<Integer>> studentScores = new HashMap<>();
        studentScores.put(1001, Arrays.asList(85, 90, 59));
        studentScores.put(1002, Arrays.asList(83, 39, 100));
        studentScores.put(1003, Arrays.asList(77, 60, 90));

        // 학생들의 평균 점수 계산
        Map<Integer, Double> averageScores = new HashMap<>();
        for(Map.Entry<Integer, List<Integer>> entry : studentScores.entrySet()) {
            List<Integer> scores = entry.getValue();
            double average = scores.stream().mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            averageScores.put(entry.getKey(), average);
        }
        System.out.println("학생 평균 점수: " + averageScores);

        // 최고 점수 학생 출력
        int topStudent = averageScores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(-1);
        System.out.println("최고 점수 학생: 학번 -> " + topStudent + ", 평균 점수 -> " + averageScores.get(topStudent));

    }
}
