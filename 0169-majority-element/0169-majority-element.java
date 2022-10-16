class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length/2;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);    
            }else{
                map.put(num,1);
            }
            if(map.get(num)>size){
                return num;
            }
        }
        
      
        
        return count;
    }
}