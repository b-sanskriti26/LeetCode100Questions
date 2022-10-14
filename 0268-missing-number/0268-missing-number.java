class Solution {
    public int missingNumber(int[] nums) {
      int length=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
      
        return -1;
    }
}