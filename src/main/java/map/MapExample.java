package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(102, "Bob");
        map.put(101, "Alice");
        map.put(102, "Charlie");
        System.out.println("map: " + map);
    }
}
