package Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class uniquePath {
    public static int uniquePaths(int m, int n) {
        List<List<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(-1);
            }
            dp.add(row);
        }
        return countPaths(0, 0, m, n, dp);
    }

    public static int countPaths(int i, int j, int m, int n, List<List<Integer>> dp) {
        
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
       
        if (dp.get(i).get(j) != -1) return dp.get(i).get(j);

        int rightPaths = countPaths(i, j + 1, m, n, dp);
        int downPaths = countPaths(i + 1, j, m, n, dp);

        dp.get(i).set(j, rightPaths + downPaths);
        return dp.get(i).get(j);
    }
    
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}

