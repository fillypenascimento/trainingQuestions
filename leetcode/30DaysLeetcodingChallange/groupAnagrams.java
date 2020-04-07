
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();

        HashMap<String, List<String>> ans = new HashMap<String, List<String>>();

        for (String s : strs) {
            char[] string_in_characters = s.toCharArray();
            Arrays.sort(string_in_characters);
            String key = String.valueOf(string_in_characters);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<String>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());

        // NÃO FUNCIONA POIS A SOMA PODE SER IGUAL PARA DUAS STRINGS COM CARACTERES DIFERENTES
        // Map<Integer,List<String>> map_table = new HashMap<Integer,List<String>>();
        // List<List<String>> result = new ArrayList<List<String>>();
        
        // for(int i=0;i<strs.length;i++){
        //     int str_length = strs[i].length(), str_value=0;
        //     String str = strs[i];
        //     for(int j=0;j<str_length;j++){
        //         str_value+=(int)str.charAt(j);
        //     }
        //     if(map_table.containsKey(str_value)){
        //         List<String> list = map_table.get(str_value);
        //         list.add(strs[i]);
        //         map_table.replace(str_length, list);
        //     } else {
        //         List<String> list = new ArrayList<String>();
        //         list.add(strs[i]);
        //         map_table.put(str_value, list);
        //     }
        // }

        // map_table.forEach((key,value) -> result.add(value));

        // return result;
    }
}