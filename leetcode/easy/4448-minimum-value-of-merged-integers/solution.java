class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 1; i += 2){
            String merged = String.valueOf(nums[i]) + String.valueOf(nums[i+1]);
            int mer =  Integer.parseInt(merged);

            min = Math.min(min, mer);
        }

        return min;
    }
}