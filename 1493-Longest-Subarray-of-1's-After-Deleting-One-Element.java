class Solution {
    public int longestSubarray(int[] nums) {
        
        int l=0;
        int r;
        int max=0;
        int zeros=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeros+=1;
            }
            while(zeros>1){
                if(nums[l]==0){
                    zeros-=1;
                    
                }
                l++;
            }
            max=Math.max(max,r-l);
        }
        return max;
    }
}