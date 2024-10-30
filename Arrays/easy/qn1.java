package Arrays.easy;

import java.util.*;

public class qn1 {

    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        // Write your code here.
        int carry = 0;
        int length = arr.size();

        int d = arr.get(length - 1);
        arr.set(length - 1, (d + 1) % 10);
        carry = (d + 1)/ 10;

        for (int i = length - 2; i >= 0; i--) {
             int sum = carry + arr.get(i);
            arr.set(i, sum % 10);
            carry = sum / 10;
        }
        if(carry !=0) {
            arr.add(0, carry);
        }

        while (!arr.isEmpty() && arr.get(0) == 0) {
            arr.remove(0);
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,0,0));

        System.out.println(addOneToNumber(list).toString());

    }
}
