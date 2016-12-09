package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        if (size == 0)
            return 0;
        int maxProfit = 0;
        int sofarMin = prices[0];
        for (int i = 0; i < size; i++) {
            if (prices[i] < sofarMin)
                sofarMin = prices[i];
            else
                maxProfit = Math.max(maxProfit, prices[i] - sofarMin);
        }
        return maxProfit;
    }
}
