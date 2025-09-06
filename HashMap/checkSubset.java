package HashMap;

import java.util.*;
public class checkSubset {
    

    public static void main(String[] args) {
        int a[] = {10, 5, 2, 23, 19};
        int b[] = {19, 5, 3};
        


        System.out.println(isSubset(a, b));
    }
    public static boolean isSubset(int a[], int b[]) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        
        for(int i: a) {
            if(map1.containsKey(i)) {
                map1.put(i, map1.get(i)+1);
            } else {
                map1.put(i, 1);
            }
            
        }
        
        for(int i: b) {
            if(map2.containsKey(i)) {
                map2.put(i, map2.get(i)+1);
            } else {
                map2.put(i, 1);
            }
            
        }
        
        int count = 0;
        for (Integer key : map2.keySet()) {
            if(map2.get(key)!= 0 && map1.containsKey(key) && map2.get(key) <= map1.get(key)) {
                count ++;
            }
        }
        
        if(count == map2.size()) {
            return true;
        }
        
        return false;        
    }
}

