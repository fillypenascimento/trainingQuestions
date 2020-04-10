package trainingQuestions.leetcode.30DaysLeetcodingChallange;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}




// class Solution {
//     public boolean backspaceCompare(String S, String T) {


//         int i = S.length() - 1, j = T.length() - 1, counter = 0;
//         String sS = "", sT = "";

//         while(i >= 0) {
//             if(S.charAt(i) != '#'){
//                 System.out.println("sS before: " + sS);
//                 if(counter > 0){
//                     counter--;
//                 } else {
//                     sS = sS + S.charAt(i);    
//                 } 
//                 System.out.println("sS after: " + sS);
//             } else {
//                 counter++;
//             }
//             i--;
//         }
        
//         counter = 0;

//         while(j >= 0) {
//             if(T.charAt(j) != '#'){
//                 System.out.println("sT before: " + sT);
//                 if(counter > 0){
//                     counter--;
//                 } else {
//                     sT = sT + T.charAt(j);
//                 } 
//                 System.out.println("sT after: " + sT);
//             } else {
//                 counter++;
//             }
//             j--;
//         }

//         return sS.equals(sT);
//     }
// }