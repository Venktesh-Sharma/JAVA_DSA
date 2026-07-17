package Hashing;

import java.util.HashSet;

public class HS1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // Duplicate

        System.out.println(set);
    }
}
