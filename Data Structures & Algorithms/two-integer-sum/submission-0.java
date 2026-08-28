class Solution {
    public int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> c = new ArrayList<>();
        int[] op = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            c.add(nums[i]);
        }

        for(int j=0;j<nums.length;j++)
        {
            int req = target-nums[j];
            if(c.contains(req) && c.indexOf(req)!=j)
            {
                op[0] = c.indexOf(req);
                op[1] = j;
            }
        }
        return op;
    }

}
