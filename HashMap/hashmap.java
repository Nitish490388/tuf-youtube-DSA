package HashMap;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Nitish");
        map.put(2,"Subhasmita");
        map.put(3,"Mahapurusha");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for(String value : map.values()) {
            System.out.println(value);
        }

        // Methods 
    
        // System.out.println(map.containsKey(1));
        // System.out.println(map.containsValue("Nitish kumar jena"));
    }
}
