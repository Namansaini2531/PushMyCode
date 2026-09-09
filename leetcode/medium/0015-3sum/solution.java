class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);

                    result.add(triplet);

                    l++;
                    r--;
                }
                else if(sum<0)
                {
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}