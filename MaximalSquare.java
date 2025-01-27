// tc = O(m*n)
// sc = O(1)
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix == null) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
       // boolean flag = false;
        int max = Integer.MIN_VALUE;
        int [][] dp = new int[m+1][n+1];

        for(int i = 1 ; i <= m ; i++){
            for (int j = 1 ; j <= n ; j++){
               // System.out.println(m+1);
                if(matrix[i-1][j-1] == '1'){
                   dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                   max = Math.max(max , dp[i][j]);
                }

            }
        }
        return max*max;
    
    }
}