package Practice;

public class q5 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,0,0,0,1,1,1};
        int ar[] = {1,2,3};
        System.out.println(solution(arr));
    }

    static int solution(int arr[]) {
        int max = 0, one = 0, zero = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int len = j-1+1;
                for(int k = i; k<= j; k++) {
                   if(arr[k] == 0) {
                    zero++;
                   } else {
                    one++;
                   }

                   if(zero == one && len != arr.length) {
                    max= Math.max(max,len);
                   }
                }
            }
        }
        return max;
    }
}
