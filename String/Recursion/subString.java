package String.Recursion;
import java.util.ArrayList;

public class subString {

    static ArrayList<String> subString(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        list.addAll(subString(p, up.substring(1)));
        list.addAll(subString(p+ch, up.substring(1)));
        return list;
    }
    static void print_substring(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        print_substring(p, up.substring(1));
        print_substring(p+ch, up.substring(1));
    }
    
    public static void main(String[] args) {
        // print_substring("", "abc");
        System.out.println(subString("", "abcd").toString());
    }
}
