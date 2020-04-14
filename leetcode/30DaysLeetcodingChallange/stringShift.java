package trainingQuestions.leetcode.30DaysLeetcodingChallange;

class Solution {
    public String stringShift(String s, int[][] shift) {
        int slength = s.length();

        if(slength == 0) return "";
        
        int i = 0, final_moves = 0;
        
        while(i < shift.length){
            if(shift[i][0] == 0) final_moves -= shift[i][1];
            else if(shift[i][0] == 1) final_moves += shift[i][1];
            i++;
        }


        int moves = final_moves % slength;
        
        if(final_moves == 0 || moves == 0){
            return s;
        } else if(final_moves < 0){
            StringBuilder sb = new StringBuilder(s);
            while(moves != 0){
                // WITHOUT USING STRING BUILDER (SLOWER)
                // char aux = s.charAt(0);
                // s = s.substring(1) + aux;
                // moves++;

                char aux = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.insert(slength-1, aux);
                moves++;
            }
            return sb.toString();
        } else {
            StringBuilder sb = new StringBuilder(s);
            while(moves != 0){
                // WITHOUT USING STRING BUILDER (SLOWER)
                // char aux = s.charAt(slength-1);
                // s = aux + s.substring(0, slength-1);
                // moves--;

                char aux = sb.charAt(slength-1);
                sb.deleteCharAt(slength-1);
                sb.insert(0, aux);
                moves--;
            }
            return sb.toString();
        }
        // WITHOUT USING STRING BUILDER (SLOWER)
        // return s;
    }
}