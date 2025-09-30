package Arrays.sort;

public class selectionSort {
    public static void main(String[] args) {
        for(int n: solution(new int[] {1,4,3,9,5,3})){
            System.out.print(n+" ");
        }
    }

    static int[] solution(int arr[]) {

        for(int i = 0; i<arr.length; i++) {
            int idx = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[idx]) {
                    idx=j;
                }
            }

            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
