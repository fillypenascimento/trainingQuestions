package trainingQuestions.leetcode.30DaysLeetcodingChallange;

import java.util.HashMap;
import java.util.Map;


class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        int result = 0;

        for(int i = 0; i<arr.length; i++){
            if(!myMap.containsKey(arr[i])){
                myMap.put(arr[i],1);
            } else {
                int aux = myMap.get(arr[i]) + 1;
                myMap.replace(arr[i],aux);
            }
        }

        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(myMap.containsKey(entry.getKey()+1)) result += entry.getValue();
        }

        return result;
    }
}


// class Solution {
//     public int countElements(int[] arr) {
//         HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
//         int result = 0;

//         for(int i = 0; i<arr.length; i++){
//             if(!myMap.containsKey(arr[i])){
//                 System.out.println("key: " + arr[i] + " value: " + myMap.get(arr[i]));
//                 myMap.put(arr[i],1);
//             } else {
//                 int aux = myMap.get(arr[i]);
//                 myMap.replace(key,aux,aux++);
//             }
//         }

//         for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
//             int key = entry.getKey() + 1, value = entry.getValue();
//             if(myMap.containsKey(key)) result += value;
//         }

//         // ITERAR VARIÁVEIS NÃO FUNCIONA COM LAMBA EXPRESSIONS, AS VARIÁVEIS TEM QUE SER FINAIS
//         // myMap.forEach((key,value) -> {
//         //     if(myMap.containsKey(key++)){
//         //         result += value;
//         //     }
//         // });

//         return result;
//     }
// }