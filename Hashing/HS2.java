package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HS2 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<String> set1 = new HashSet<>();

        set1.add("Java___");
        set1.add("Python____");
        set1.add("C++____");

        for (String language : set1) {
            System.out.print(language + ", ");
        }
    }
}
