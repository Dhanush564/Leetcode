class Solution {
    public void moveZeroes(int[] nums) {
     int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
        }
        Arrays.fill(nums,0);
        int j=0;
        for(int i=0;i<n;i++){
          if(res[i]!=0){
             nums[j++]=res[i];
           }
       }
    
    }
}