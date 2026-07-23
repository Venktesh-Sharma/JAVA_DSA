package Hashing;

import java.util.HashSet;

public class UnionAndnItersection {
    public static void main(String[] args) {
        int arr1 [] = {7,3,9} ; 
        int arr2 [] = {6,3,9,2,9,4} ; 
        HashSet <Integer> set = new HashSet<>() ; 
        
        // UNION
        for (int i = 0 ; i < arr1.length ; i++ ) {
            set.add(arr1[i]) ; 
        }
        for ( int i=0 ; i<arr2.length;  i++) {
            set.add(arr2[i]) ; 
        }
        System.out.println("Union = " + set);
        System.out.println("Union Size = " + set.size());




        // INTERSECTION 
        
        set.clear();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersection.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection = " + intersection);
        System.out.println("Intersection Size = " + intersection.size());

    }
}
