package Chalange;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(solution(2111));
    }

    static int solution(int num) {
        int ans = 0, rem = 0;
        while(num > 0) {
            rem = num%10;
            ans*=10;
            ans+=rem;
            num /=10;
        }
        return ans;
    }
}
