package Chalange;

public class printSubArray {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,6,5});
    }

    static void solution(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                for(int k = i; k<j; k++) {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
}
