class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater=0;
        int containerWater ;

        while(left < right){
            int width = right-left;
            int high = Math.min(height[left], height[right]);
            containerWater = width*high;
             maxWater= Math.max(maxWater, containerWater);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxWater;
    }
}