package FileIo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class StudentFileIO {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) throws Exception {
        List<String> studentList = loadStudentListFromFile(FILE_NAME);
        System.out.println("[로딩 완료] 현재 학생 목록: " + studentList);
        // 새로운 학생 추가
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        System.out.println("[추가 완료] 갱신된 학생 목록: " + studentList);
        // 변경된 학생 목록 파일에 저장
        saveStudentListToFile(FILE_NAME, studentList);
        System.out.println("[저장 완료] 파일에 학생 목록을 저장했습니다.");
    }

    public static List<String> loadStudentListFromFile(String fileName) {
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        // 파일이 없으면 빈 리스트 반환 -> 예외 처리
        if(!file.exists()) {
            return list;
        }
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void saveStudentListToFile(String fileName, List<String> studentList) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            for(String name : studentList) {
                bw.write(name);
                bw.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
