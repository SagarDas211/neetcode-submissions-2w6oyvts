class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // TWO POINTERS

        int l = 0;
        int r = numbers.length -1;
        while(l<=r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }
            if(sum < target){
                l++;
            }
            if(sum > target){
                r--;
            }
        }

        return new int[]{};


        // Normarl Two Pointers

        // Map<Integer, Integer> m = new HashMap<>();
        // for(int i = 0 ; i < numbers.length; i++){
        //     int rem = target - numbers[i];
        //     if(m.containsKey(rem)){
        //         return new int[]{m.get(rem) + 1, i +1};
        //     }

        //     m.put(numbers[i], i);
        // }

        // return new int[]{};
    }
}
