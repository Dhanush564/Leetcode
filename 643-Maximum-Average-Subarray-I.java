class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;int r=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            if(r-l+1==k){
                max=Math.max(sum,max);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return (double)max/k;
    }
}