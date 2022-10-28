class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(Character ch:s.toCharArray()){
            if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        
         Map<Character,Integer> map1=new HashMap<>();
        for(Character ch:t.toCharArray()){
            if(map1.containsKey(ch)){
               map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }
       if(map.equals(map1)){
           return true;
       }else{
           return false;
       }
        
    }
}