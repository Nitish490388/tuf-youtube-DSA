package Arrays.sort;

public class bubbleSort {
    public static void main(String[] args) {
        for(int n: solution(new int[] {1,4,3,9,5,3})){
            System.out.print(n+" ");
        }
    }

    static int[] solution(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            boolean swapped = false;
            for(int j = i+1; j<arr.length - i; j++) {
                if(arr[j-1]>arr[j]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped) break; 
        }
        return arr;
    }
}
