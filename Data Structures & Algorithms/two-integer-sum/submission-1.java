class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> s = new HashMap<>();
        int[] op = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int req = target - nums[i];

            if(s.containsKey(req))
            {
                op[0] = s.get(req);
                op[1] = i;
            }
            else
            {
                s.put(nums[i],i);
            }
        }
        return op;
    }

}
