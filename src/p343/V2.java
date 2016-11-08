package p343;

public class V2 {
	
	public int integerBreak(int n) {
		if(n<=3) return n-1;
		int[] dp = new int[n+1];
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= n; i++) {
			dp[i] = Math.max(2*dp[i-2], 3*dp[i-3]);
		}
		
        return dp[n];
    }
}
