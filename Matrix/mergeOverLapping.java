package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeOverLapping {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1),intervals[i][1]));
            }
        }

        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }


    public int[][] leetcodeMerge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
  
        List<int[]> merged = new ArrayList<>();
  
        int [] prev = intervals[0];
  
        for(int i=1;i<intervals.length;i++){
  
            int [] interval = intervals[i];
  
            if(interval[0] <= prev[1])
            prev[1] = Math.max(prev[1],interval[1]);
            else{
              
              merged.add(prev);
              prev = interval;
            }
  
        }
  
        merged.add(prev);
  
        return merged.toArray(new int [merged.size()][]);
  
      }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
