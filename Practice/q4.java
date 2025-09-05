package Practice;

public class q4 {
    public static void main(String[] args) {
         int grid[][] = {{1,2,4}, {2,3,4}, {5,1,3}};
        int m = grid.length;
        int n = grid[0].length;
         int[][] dp = new int[m][n];
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solution(grid, m-1, n-1, dp));
    }

    static int solution(int[][] grid, int i, int j, int[][]dp) {
         if (i < 0 || j < 0) return Integer.MAX_VALUE;
        if(i == 0 && j ==0) return dp[0][0]; 

          int fromTop = solution(grid, i-1, j, dp);
        int fromLeft = solution(grid, i, j-1, dp);

        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] =  grid[i][j] + Math.min(fromLeft, fromTop);
        return dp[i][j];
    }
}
