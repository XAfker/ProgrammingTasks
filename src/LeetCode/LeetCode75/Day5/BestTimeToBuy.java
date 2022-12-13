package LeetCode.LeetCode75.Day5;

public class BestTimeToBuy {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int buy, tmpSell, sell;
        buy = prices[0];
        sell = 0;
        for(int i = 0; i<prices.length; i++){
            if (prices[i]<buy)
                buy = prices[i];
            tmpSell = prices[i] - buy;
            if(sell<tmpSell)
                sell = tmpSell;
        }
        return sell;
    }
}
