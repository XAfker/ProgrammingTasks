package LeetCode.LeetCode75.Day5;

public class BestTimeToBuy {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int buy, sell;
        buy = prices[0];
        sell = 0;
        for(int i = 0, j = 1; j<prices.length; i++, j++){
            if (prices[i]<buy)
                buy = prices[i];
            if(prices[j]>sell)
                sell = prices[j];
        }
        return sell - buy;
    }
}
