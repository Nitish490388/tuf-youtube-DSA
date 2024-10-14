package Arrays.medium;

public class buy_sell_stock {
    
    public static int maxProfit(int[] prices) {

        int max = 0;
        int len = prices.length;
        for(int i = 0; i<len; i++) {
            for(int j = i+1; j<len;j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7};
        System.out.println(maxProfit(arr));
    }
}
