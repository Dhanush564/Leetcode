class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int tr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tr[j][i]=grid[i][j];
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Arrays.equals(tr[j],grid[i])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}