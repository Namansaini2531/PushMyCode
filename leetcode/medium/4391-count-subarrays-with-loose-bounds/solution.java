class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        long total = 0;

        for(int num : nums){
            if(num >= minK && num <= maxK) count++;
            else count = 0;

            total += count;
        }
        return total;
    }
}