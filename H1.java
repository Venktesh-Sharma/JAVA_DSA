package Hashing;

import java.util.*; 

class H1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>() ; 
        // Insert 
        map.put("China", 150);
        map.put("India" , 100) ; 
        map.put("Japan", 50) ; 
        map.put("Apple", 1000);
        map.put("Banana", 500);
        map.put("Orange", 800);


        System.out.println(map);

        // // get()
        // int population = map.get("India") ; 
        // System.out.println(population);

        // System.out.println(map.get("Indonesia"));

        // // contains key // value 
        // map.containsKey("China") ;          // true
        // map.containsKey("Indonesia") ;      // false 

        // remove 
        // System.out.println(map.remove("Japan"));
        // System.out.println(map);

        // size () 
        // System.out.println(map.size());

        
        // Iteration on HashMap 
        // 1. keys Set  
        Set <String> keys = map.keySet() ;
        System.out.println(keys);

        for ( String k : keys) {
            System.out.println( "keys" + k + "value is : " + map.get(k));
        }
        

        // 2. Entry Set 
        // for (Map.Entry<Integer, String> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        
    }
}