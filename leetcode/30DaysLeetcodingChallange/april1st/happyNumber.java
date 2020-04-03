package trainingQuestions.leetcode

import java.util.HashSet;
import java.util.Map;

.30DaysLeetcodingChallange.april1st;

public class happyNumber {
    public boolean isHappy(int n) {
        int sum;
        Set<Integer> numbers = new HashSet<Integer>();
        
        while(numbers.add(n)){
            sum = 0;
            while(n != 0) {
                sum += Math.pow(n%10,2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}

// OPTIMAL SOLUTION
// class Solution {
//     public boolean isHappy(int n) {
//         int rem =0;
//         int sumsq = 0;
//         while(n!=0) {
//             rem = n%10;
//             sumsq += rem*rem;
//             n=n/10;
//         }
//         if(sumsq == 1)
//             return true;
//        else if(sumsq>1 && sumsq<5)
//            return false;
//         else
//           return isHappy(sumsq);
        
        
//     }
// }