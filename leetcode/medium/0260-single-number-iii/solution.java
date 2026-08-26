class Solution {
    public int[] singleNumber(int[] nums) {
        int xor_all = 0;

        for(int num : nums){
            xor_all ^= num;
        }

        int diff_bit = xor_all & -xor_all;

        int a = 0;
        int b = 0;

        for(int num : nums){
            if((num & diff_bit) != 0){
                a ^= num;
            }
            else{
                b ^= num;
            }
        }

        return new int[]{a,b};
    }
}