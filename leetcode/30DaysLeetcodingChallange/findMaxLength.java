package trainingQuestions.leetcode.30DaysLeetcodingChallange;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max_length = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(counter)) {
                max_length = Math.max(max_length, i - map.get(counter));
            } else {
                map.put(counter, i);
            }
        }
        return max_length;
    }
}