package Arrays.medium;

public class subArraySum {

    public static int subarraySum(int[] nums, int n) {
        int sum = 0;
        int start = 0, end = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++) {
            sum += nums[i];
            if(sum<0) {
                sum = 0;
                start = i+1;
            }
            if(sum>max){
                max = sum;
                end = i;
            }
            
        }
        System.out.println(start+" "+end);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,-3,-4,5,-2,4,2};
        int b = subarraySum(arr, arr.length);
        System.out.println(b);
        
    }
}
