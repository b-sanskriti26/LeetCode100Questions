class Solution {
    public int singleNumber(int[] nums) {
       // int k=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        for(int k:set){
            return k;
        }
        return 0;
    }
}