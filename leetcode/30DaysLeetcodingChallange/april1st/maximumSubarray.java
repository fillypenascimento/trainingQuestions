class Solution {
    public int maxSubArray(int[] nums) {
        int arraySize = nums.length;
        int max_until_now = Integer.MIN_VALUE, max_finish = 0, i=0;

        // considering that negative numbers will reduce the sum
        // only considers positive numbers so far
        while(i < arraySize){
            max_finish += nums[i];

            if(max_until_now < max_finish){
                max_until_now = max_finish;
            }
            if(max_finish < 0){
                max_finish = 0;
            }

            i++;
        }

        return max_until_now;   
    }
}