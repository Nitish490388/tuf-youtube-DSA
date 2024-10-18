package String.Basics;

import java.util.Scanner;

public class ChangingWorlds {
    public static String Capitalize(String s) {
        char ch = Character.toUpperCase(s.charAt(0));

        String str = ""+ch; 
        for(int i = 1; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                str+=s.charAt(i);
            } else {
                str+= s.charAt(i);
                if(i+1 < s.length()) {
                    str += Character.toUpperCase(s.charAt(i+1));
                    i++;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Capitalize(s));
    }
}
