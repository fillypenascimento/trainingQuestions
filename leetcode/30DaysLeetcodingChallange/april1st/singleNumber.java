import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(myMap.containsKey(nums[i])){
                int val = myMap.get(nums[i]) + 1;
                myMap.remove(nums[i]);
                myMap.put(nums[i], val)
            } else {
                myMap.put(nums[i], 1);
            }
        }
            
        for(int i = 0; i < nums.length; i++){
            if(myMap.get(nums[i]) == 1){
                result = nums[i];
            }
        }

        return result;
    }
}


// OPTIMAL SOLUTION
// class Solution {
//     public int singleNumber(int[] nums) {
//         if(nums == null || nums.length == 0) return 0;
        
//         int n = nums.length;
//         int ans = 0;
//         for(int i=0; i<n; i++) {
//             ans ^= nums[i];
//         }
        
//         return ans;
//     }
// }