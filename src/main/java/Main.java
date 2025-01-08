import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] fruitsArray = {"Banana","Mango","Graph","Orange","Apple"};
        List<String> fruitsList = Arrays.asList("Banana","Mango","Graph","Orange","Apple");

        System.out.println("배열: ");
        for(String fruit : fruitsArray) {
            System.out.println(fruit + " ");
        }
        System.out.println("ArrayList: " + fruitsList);

    }
}
