class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for (int j=nums1.length-1;j>=0;j--){
            if(nums1[j]==0){
                 index=j;
                 
            }else if(nums1[j]!=0) {
            	break;
            }
        }
        
        for(int num:nums2){
            nums1[index]=num;
            index+=1;
        }
        Arrays.sort(nums1);
       // System.out.println("result"+nums1);
    }
}