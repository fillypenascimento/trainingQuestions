package trainingQuestions.leetcode.30DaysLeetcodingChallange;

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0, newIndex = 0;
        
        while(index < nums.length){
            if(nums[index] != 0){
                nums[newIndex] = nums[index];
                newIndex++;
            }
            index++;
        }

        while(newIndex < nums.length){
            nums[newIndex] = 0;
            newIndex++;
        }
    }
}