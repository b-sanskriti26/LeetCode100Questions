class Solution {
    public int maxProfit(int[] price) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i=0;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            }else{
                max=Math.max(max,price[i]-min);
            }
        }
        return max;
    }
}