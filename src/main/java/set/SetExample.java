package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("b");
        System.out.println(hashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        System.out.println(treeSet);
    }
}
