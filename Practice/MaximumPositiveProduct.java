package Practice;

public class MaximumPositiveProduct {
    public static void main(String[] args) {
        System.out.println(getMaxLen(new int[]{1,2,-3,-4,-5,6,7,4}));
    }

    static int getMaxLen(int[] nums) {
    int posLen = 0, negLen = 0, maxLen = 0;

    for (int num : nums) {
        if (num == 0) {
            posLen = 0;
            negLen = 0;
        } else if (num > 0) {
            posLen = posLen + 1;
            negLen = (negLen == 0) ? 0 : negLen + 1;
        } else { // num < 0
            int temp = posLen;
            posLen = (negLen == 0) ? 0 : negLen + 1;
            negLen = temp + 1;
        }
        maxLen = Math.max(maxLen, posLen);
    }

    return maxLen;
}

}
