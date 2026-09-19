class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum += nums[i];
        double avg = (double) sum / k;
        double best = avg;
        for(int x = k; x < nums.length; x++){
            sum += nums[x] - nums[x - k];
            avg = (double) sum / k;
            best = Math.max(best, avg);
        }
        System.gc();
        return best;
    }
}