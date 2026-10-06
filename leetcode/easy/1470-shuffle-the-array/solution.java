class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
            arr[i + n] = nums[i + n];
        }

        return arr;
    }
}