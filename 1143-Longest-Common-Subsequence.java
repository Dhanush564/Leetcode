class Solution {
   public int longestCommonSubsequence(String text1, String text2) {
       int[][] dp = new int[text1.length() + 1][text2.length() + 1] ;
       // Arrays.fill(dp , -1) ;
       for(int i = 0 ; i < dp.length ; i++){
           for(int j = 0 ; j < dp[0].length ; j++){
               dp[i][j] = -1 ;
           }
       }
       return helper(text1 , text2 , text1.length() , text2.length() , dp) ;
   }


   public int helper(String s1 , String s2 , int n , int m , int[][]dp){
       if(n==0 || m==0) return 0 ;


       if(dp[n][m] != -1) return dp[n][m] ;
      
       if(s1.charAt(n-1) == s2.charAt(m-1)){
           dp[n][m] = 1 + helper(s1 , s2 , n-1 , m-1,dp) ;
           return  1 + helper(s1 , s2 , n-1 , m-1,dp) ;
       }
      
       int s1exculde = helper(s1,s2,n-1,m , dp) ;
       int s2exculde = helper(s1,s2,n,m-1,dp) ;
       dp[n][m] =  Math.max(s1exculde , s2exculde) ;
   return Math.max(s1exculde , s2exculde) ;


   }
}
