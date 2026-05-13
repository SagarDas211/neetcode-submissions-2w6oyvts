class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
            if(numsMap.get(nums[i]) >= 2){
                return true;
            }
        }

        return false;
    }
}