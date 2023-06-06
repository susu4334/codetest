import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> hm = new HashMap<String, Integer>();
        
        for(String name: participant){
             hm.put(name,hm.getOrDefault(name,0)+1);
        }
        
        for(String name: completion){
             hm.put(name,hm.get(name)-1);
        }
        
        for(Map.Entry<String,Integer> playerMap: hm.entrySet()){
            if(playerMap.getValue() == 1){
                answer = playerMap.getKey();
            }
        }
        return answer;
    }
}