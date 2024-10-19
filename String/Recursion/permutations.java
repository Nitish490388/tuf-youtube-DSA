package String.Recursion;

/**
 * permutations
 */
public class permutations {

    static void print_permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i<= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            print_permutations(f+ch+s, up.substring(1));
        }
    }

    public static void main(String[] args) {
        print_permutations("", "abcdef");
    }
}