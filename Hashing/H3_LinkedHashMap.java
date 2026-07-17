package Hashing ; 
import java.util.LinkedHashMap;
class H3_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap <String , Integer > map = new LinkedHashMap<>() ; 
        map.put("China", 150);
        map.put("India" , 100) ; 
        map.put("Japan", 50) ; 
        map.put("Apple", 1000);
        map.put("Banana", 500);
        map.put("Orange", 800);
        System.out.println(map);
    }
}
