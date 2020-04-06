package trainingQuestions.leetcode.30DaysLeetcodingChallange;

class Solution {
    public int maxProfit(int[] prices) {
        // int min_day_until_now, min_price, max_day_until_now, max_price, profit=0,k=0;
        // boolean isBuying = true;


        // while(k < prices.length){
        //     if(k+1 >= prices.length)
        //         break;
        //     // if(isBuying){
        //         min_price = prices[k];
        //         min_day_until_now = k;
        //         for(int i = k+1; i<prices.length; i++){ 
        //             if(prices[i] < min_price){ 
        //                 min_price = prices[i];
        //                 min_day_until_now = i;
        //             }
        //         }
        //     // }
    
        //     if(min_day_until_now+1 >= prices.length)
        //         break;
        //     // if(!isBuying){
        //         max_price = prices[min_day_until_now++];
        //         max_day_until_now = min_day_until_now++;
        //         for(int j = min_day_until_now+2; j<prices.length; j++){
        //             if(prices[j] > max_price){
        //                 max_price = prices[j];
        //                 max_day_until_now = j;
        //             }
        //         }
        //     // }
    
        //     profit += (max_price - min_price);
        //     min_price = max_price = 0;
        //     k = max_day_until_now + 1;
        // }
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit+=(prices[i] - prices[i-1]);
            }
            
        }
        return profit;

    }

    public static int getMinFromIthDay(int[] inputArray){ 
        int minValue = inputArray[startDay], i = startDay;
        for(i; i<inputArray.length; i++){ 
          if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
          }
        }
        return minValue;
    } 

    public static int getMaxFromIthDay(int[] inputArray){ 
        int maxValue = inputArray[startDay], i = startDay; 
        for(i; i < inputArray.length; i++){ 
            if(inputArray[i] > maxValue){ 
                maxValue = inputArray[i]; 
            } 
        } 
        return maxValue; 
    }
}