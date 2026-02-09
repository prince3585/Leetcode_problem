class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minSize = Integer.MAX_VALUE;
      int sum = 0;
      int j=0;
      
      for(int i=0;i<nums.length;i++){
        sum = sum + nums[i];
      
      while(sum >= target){
        int currentSize = i-j+1;
        minSize = Math.min(minSize, currentSize);
        sum = sum - nums[j];
        j++;
       }
      }
        return minSize == Integer.MAX_VALUE ? 0 : minSize ;
     
    }
}