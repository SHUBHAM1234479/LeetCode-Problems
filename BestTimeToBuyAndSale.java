package LeetCode;

public class BestTimeToBuyAndSale {
	
	    public int maxProfit(int[] prices) {
	       int max_profit = 0;
	       int min_price = Integer.MAX_VALUE;
	       for(int price : prices){
	        if(price < min_price)
	            min_price = price;

	        int profit = price - min_price;
	        if(max_profit < profit)
	            max_profit = profit ;
	       }
	    return max_profit;
	    }

	    public static void main(String[] args){

	        int arr[] = {7,1,5,3,6,4} ;
	        BestTimeToBuyAndSale sol = new BestTimeToBuyAndSale() ;
	        System.out.println(sol.maxProfit(arr)) ;
	    }
	}


