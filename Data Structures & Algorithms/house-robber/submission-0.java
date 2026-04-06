class Solution {
    public int rob(int[] nums) {
         /* recursion */
        // int[] dp = new int[nums.length];
        // for(int i = 0; i<nums.length; i++){
        //     dp[i] = -1;
        // }
        // return houseRob(nums, nums.length - 1, dp);

        /* DP */
        // int[] dp = new int[nums.length];

        // dp[0] = nums[0];

        // for(int i =1; i<nums.length; i++){
        //     int l = nums[i];
        //     if(i>1){
        //         l += dp[i-2];
        //     }
        //     int r = dp[i-1];
        //     dp[i] = Math.max(l, r);
        // }

        // return dp[nums.length - 1];

        /* Space Optimisation */
        int prev = 0;
        int prev1 = nums[0];

        for(int i =1; i<nums.length; i++){
            int l = nums[i] + prev;
            int r = prev1;

            prev = prev1;
            prev1 = Math.max(l, r);
        }

        return prev1;
    }

    // public int houseRob(int[] nums, int n, int[] dp){
    //     if(n == 0){
    //         return nums[n];
    //     }
    //     if(n < 0){
    //         return 0;
    //     }

    //     if(dp[n] != -1){
    //         return dp[n];
    //     }

    //     int l = nums[n] + houseRob(nums, n-2, dp);
    //     int r = houseRob(nums, n-1, dp);

    //     dp[n] = Math.max(l, r);

    //     return dp[n];
    // }
}
