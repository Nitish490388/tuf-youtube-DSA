package Chalange;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("m%o%o*m"));
    }

    static boolean solution(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) == false) {
                i++;
                continue;
            }

            if (Character.isLetterOrDigit(s.charAt(j)) == false) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
