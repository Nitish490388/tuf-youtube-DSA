package String.Basics;

public class Factorial {

    public static int FirstFactorial(int num) {

        return num;
    }

    public static int factorial(int num) {
     
        int[] dp = new int[num + 1];
        dp[0] = 1; 
        for (int i = 1; i <= num; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[num];
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
