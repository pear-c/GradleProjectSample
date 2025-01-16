package map;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparableTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "three");
        map.put(1, "one");
        map.put(2, "two");

        System.out.println(map);
    }
}
