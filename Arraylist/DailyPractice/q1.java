package Arraylist.DailyPractice;

// Problem:
// Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.

// Input: nums = [2,7,11,15], target = 9

// Output: [0,1] (because nums[0] + nums[1] = 2 + 7 = 9)

// Constraints:

// Each input would have exactly one solution.

// You may not use the same element twice.

// Time complexity better than O(n²) is expected.


public class q1 {
    static int[] solution(int[] arr, int target) {

        int[] ans = new int[2];
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    } 
    
    public static void main(String[] args) {
        int arr[] = new int[] {1,4,5,7,3};
        for(int n: solution(arr,6)) {
            System.out.print(n + " ");
        }
    }
}
