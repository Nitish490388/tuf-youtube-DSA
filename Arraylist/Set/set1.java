package Arraylist.Set;
import java.util.HashSet;

public class set1 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>(); 

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("banana");

        System.out.println(fruits);

        fruits.forEach((f) -> {
            System.out.println(f);
        });

        
    }
}
