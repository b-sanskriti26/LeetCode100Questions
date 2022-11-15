
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums1.length;i++){
          
               map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
           
       }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
   
        int[] arr=new int[list.size()];
        int k=0;
        for(int n:list){
            arr[k]=n;
            k+=1;
        }
       
    return arr;
    }
}


/*
class Solution {
public int[] intersect(int[] nums1, int[] nums2) {
HashMap<Integer, Integer> map = new HashMap();
ArrayList<Integer> list = new ArrayList();
for(Integer it: nums1) map.put(it, map.getOrDefault(it, 0)+1);
for(int i=0; i<nums2.length; i++){
if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
list.add(nums2[i]);
map.put(nums2[i], map.get(nums2[i])-1);
}
}
int[] arr = new int[list.size()]; int k=0;
for(Integer it: list) arr[k++] = it;
return arr;
}
}
*/