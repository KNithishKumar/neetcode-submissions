class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(arr.contains(nums[i]))
            {
                count++;
                i=nums.length-1;
            }
            else
            {
                arr.add(nums[i]);
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
}