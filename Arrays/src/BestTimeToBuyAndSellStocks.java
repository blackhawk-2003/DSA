import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {

    public static int calculateProfit(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                if(maxProfit<profit){
                    maxProfit=profit;
                }
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prices []= {7,6,4,3,2,1};
        System.out.println(calculateProfit(prices));
    }
}
