package Hashing;

import java.util.HashMap;
import java.util.Set;

public class LC_169 {
    public int majorityElement(int[] nums) {
        HashMap <Integer , Integer> map = new HashMap<>() ; 
        for ( int i = 0 ; i < nums.length ; i++) {
            // if ( map.containsKey(nums[i])) {
            //     map.put(nums[i] , map.get(nums[i])+1 ) ;
            // } else {
            //     map.put(nums[i] , 1) ; 
            // }

            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1 ) ; 

        }
         Set<Integer> keySet = map.keySet() ; 
         for (Integer keys : keySet) {
            if (map.get(keys) > nums.length/2 ) {
                return keys ; 
            }
         }

         return -1 ; 
    }

}
