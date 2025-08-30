package Arraylist;
import java.util.ArrayList;
import java.util.Collection;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,4);

        list.get(0);
        list.remove(0);
        list.clear();
        list.contains(2);

        for(int i: list) {
            System.out.println(i+" ");
        }
        System.out.println(list.size());

        
        
    }
}
