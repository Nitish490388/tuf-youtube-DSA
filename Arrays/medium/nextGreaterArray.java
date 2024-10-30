package Arrays.medium;
import java.util.*;


// https://www.naukri.com/code360/problems/next-greater-element_670312?topic=arrays&count=25&page=1&search=&sort_entity=order&sort_order=ASC
public class nextGreaterArray {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
    
        // Initialize nge array with -1
        for (int i = 0; i < n; i++) {
            nge[i] = -1;
        }
    
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack smaller than or equal to arr[i]
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
    
            // If stack is not empty, top element is the next greater element
            if (!st.isEmpty()) {
                nge[i] = st.peek();
            }
    
            // Push the current element onto the stack
            st.push(arr[i]);
        }
        return nge;
    }


    public static void main(String[] args) {
        int array[] = {2,5,3,83,1,42};
        int ar[] = nextGreaterElement(array, array.length);

        for(int i: ar) {
            System.out.println(i);
        }
    }
}
