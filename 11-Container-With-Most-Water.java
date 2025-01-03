class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int ans=w*h;
            max=Math.max(max,ans);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}