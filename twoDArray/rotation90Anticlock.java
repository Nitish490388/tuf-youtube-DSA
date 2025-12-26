package twoDArray;
public class rotation90Anticlock {
    public static void main(String[] args) {
         int arr[][] = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // printArray(arr);

        int[][] rotated = rotate(arr, 3, 3);
        
        printArray(rotated);
    }
     static int[][] rotate(int mat[][], int a, int b) {
        int sol[][] = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sol[b-1-j][i] = mat[i][j];
            }
        }
        return sol;
    }

     static void printArray(int arr[][]) {
        int a = arr.length;
        if (a == 0) return;
        int b = arr[0].length;

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
