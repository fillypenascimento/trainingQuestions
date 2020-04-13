package trainingQuestions.leetcode.30DaysLeetcodingChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];

        List<Integer> stonesList = IntStream.of(stones).boxed().collect(Collectors.toList());
        
        while(stonesList.size() > 1){
            Collections.sort(stonesList);
            int i = stonesList.remove(stonesList.size()-1), j = stonesList.remove(stonesList.size()-1);
            if(i - j < 0){
                stonesList.add(j-i);
            } else if(j - i < 0){
                stonesList.add(i-j);
            }
        }

        if(stonesList.size() > 0) return stonesList.get(0); else return 0;
    }
}