package Practice;

public class prefixSum {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(solve(arr, 3));
    }

    static int solve(int arr[], int target) {
        int mazLen = 0;
        for(int i = 0; i< arr.length; i++) {
            int len = 0;
            int sum = 0;
            for(int j = i; j<arr.length; j++) {
                sum+=arr[j];
                len++;
                if(sum==target) {
                    mazLen = Math.max(mazLen, len);
                }
                if(sum>target) {
                    break;
                }
            }
        }
        return mazLen;
    }
}
