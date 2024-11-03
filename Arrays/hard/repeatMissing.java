package Arrays.hard;

public class repeatMissing {

    public static int[] repeatedNumberMath(final int[] a) {
        long n = a.length; 

        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;

        for(int i = 0; i< n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;

        val2 = val2 / val1;

        long x = (val1+val2)/2;
        long y = x - val1;
        int [] ans = {(int)x, (int)y};

        return ans;
    }

    public static int[] repeatedNumberXor(final int[] a) {
        int n = a.length;
        int xr = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i+1);
        }

        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5};
        for(int a: repeatedNumberXor(arr)) {
            System.out.print(a+" ");
        }
    }
    
}
