package Practice;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        // System.out.println(solution(arr));
        System.out.println(solution(new int[]{-2,-3,0,-2,-40}));
    }

    static int solution(int[] nums) {
        
        int maxProd = nums[0];  
        int currMax = nums[0];  
        int currMin = nums[0];

        for(int i = 1; i< nums.length; i++){
            int num = nums[i];

            if(num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(currMax*num, num);
            currMin = Math.min(currMin*num, num);

            maxProd = Math.max(currMax, maxProd);
        }
        
        return maxProd;
    }
}
