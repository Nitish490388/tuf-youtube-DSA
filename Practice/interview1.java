package Practice;
public class interview1 {

    public static void printSubstring(String s) {
        String ans = "";
        int n = s.length();
        for(int i = 0; i<n;  i++) {
            ans="";
            for(int j = i; j<n; j++) {
                ans += s.charAt(j);
                System.out.println(ans);
            }
        }
    }
    public static void main(String[] args) {
        printSubstring("abcd");
    }
}
