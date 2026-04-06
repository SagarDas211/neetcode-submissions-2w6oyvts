class Solution {
    public int housRob(int[] nums) {
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
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        // int[] temp1 = Arrays.copyOfRange(nums, 1, nums.length);
        // int[] temp2 = Arrays.copyOfRange(nums, 0, nums.length-1);

        int[] t1 = new int[nums.length-1];
        int[] t2 = new int[nums.length-1];

        for(int i = 0; i<nums.length; i++){
            if(i != 0 ){
                t1[i-1] = nums[i];
            }
            if(i != nums.length -1 ){
                t2[i] = nums[i];
            }
        }
        int maxTemp1 = housRob(t1);
        int maxTemp2 = housRob(t2);
        
        return Math.max(maxTemp1, maxTemp2);
    }
}
