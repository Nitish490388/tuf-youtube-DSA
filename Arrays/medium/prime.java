package Arrays.medium;

/**
 * prime
 */
public class prime {

    public static boolean isPrime(int n) {
        if(n<=2) return true;

        for(int i = 2; i<n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void printOdd() {
        int n = 100;
        for(int i = 0; i<= 100; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        printOdd();
    }
    
}

