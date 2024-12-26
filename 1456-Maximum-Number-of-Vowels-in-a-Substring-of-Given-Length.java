class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int vow[]=new int[n];
        
        for(int i=0;i<n;i++){
         char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow[i]=1;
            }
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=0;
        while(r<n){
            sum+=vow[r];
            if(r-l+1==k){
                max=Math.max(sum,max);
                sum-=vow[l];
                l++;
            }
            r++;
        }
        return max;
    }
}