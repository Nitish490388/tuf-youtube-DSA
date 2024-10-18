package String.Basics;

import java.util.Scanner;

public class Print_ascii {

    static void print_ascci(String s) {
        for(int i = 0; i< s.length(); i++) {
            System.out.println((byte)s.charAt(i));
        }
    }

    public static void print_upper(String s) {
        for(int i = 0; i< s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                System.out.println(s.charAt(i));
            }
        }
    }

    public static void print_not_space(String s) {
        for(int i = 0; i< s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i))) {
                
            } else {
                System.out.println(s.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        // print_ascci(s1);
        // print_upper(s1);
        print_not_space(s1);
    }
}
