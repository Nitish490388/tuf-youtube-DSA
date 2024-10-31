package Matrix;

public class rotate {

    public static void main(String[] args) {
        int arr[][] = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9, 10, 11, 12},
            {13,14,15,16}
        };
        int ans[][] = rotateMatrixOptimal(arr);
        for(int i[]: ans) {
            for(int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }

    // Brute force
    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for(int i = 0; i< n ; i++) {
            for(int j = 0; j< n; j++) {
                rotated[j][n-i-1] = matrix[i][j]; 
            }
        }

        return rotated;
    }

    // Optimal solution
    static int[][] rotateMatrixOptimal(int[][] matrix) {
        int n = matrix.length;
        // tranposing
        for(int i = 0; i<n-1; i++) {
            for(int j = i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<n ; i++) {
            reverse(matrix[i]);
        }

        return matrix;
    }


    public static void reverse(int[] arr) {
        int i = 0, j=arr.length-1;
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
