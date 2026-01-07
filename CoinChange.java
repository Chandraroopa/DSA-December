//int amount = total sum 
class Solution {
    public int coinChange(int[] coins, int amount) {
        int coin = 0;
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) 
            Arrays.fill(row, -1);
        int ans=coin(coins,amount,0,dp);
        return ans >= 1000000000 ? -1 : ans;
    }

    public int coin(int[] coins, int amount, int i, int[][] dp){
        if(amount == 0)
            return 0;
        if( i == coins.length || amount < 0)
            return 1000000000;
        if(coins[i] > amount)
            return coin(coins, amount, i+1, dp);
        if(dp[i][amount] != -1)
            return  dp[i][amount];
        
        int take = 1 + coin(coins, amount - coins[i], i, dp);
        int nottake = coin(coins, amount, i+1, dp);
        return dp[i][amount] = Math. min(take, nottake);
    }
}
