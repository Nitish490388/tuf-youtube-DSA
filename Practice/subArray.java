package Practice;

public class subArray {
    public static void main(String[] args) {
        int arr[] = {1,2, -5, 3,5, -4,7,1,-5};
        System.out.println(solve(arr, arr.length-1));
        
    }

    static int solve(int arr[], int n) {

        if(n == 1) return arr[0];

        int newOne = arr[n];
        int extend = solve(arr, n-1) + arr[n];

        return Math.max(newOne, extend);
    }
}
