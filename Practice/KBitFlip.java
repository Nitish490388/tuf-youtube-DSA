package Practice;

public class KBitFlip {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1};
        int arr1[] = {0, 0, 1, 1, 1, 0, 0};
        int k = 2;
        System.out.println(solution(arr,k));
        System.out.println(solution(arr1,3));
    }

    public static int solution(int [] arr, int k) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == 0) {
                if(i+k-1 > arr.length-1) return -1;
                count ++;
                for(int j=0; j<k;j++) {
                    arr[i+j] = arr[i+j] == 0 ? 1 : 0;
                }
            }
        }

        return count;
    }
}

