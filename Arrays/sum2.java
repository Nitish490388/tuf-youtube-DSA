package Arrays;

public class sum2 {
    static boolean twoSum(int n, int []arr, int target) {
        int left = 0, right = n-1;
        int sum = 0;

        while(left<right) {
            sum = arr[left]+ arr[right];
            if(sum == target) return true;
            else if(sum < target) left++;
            else right--;

        }
        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        boolean ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
    
}
