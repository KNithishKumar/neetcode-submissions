class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] op = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            left[i] = 1;
            right[i] = 1;
        }
        left[0] = nums[0]*left[0];
        right[nums.length-1] = nums[nums.length-1];

        for(int i=1;i<nums.length;i++)
        {
            left[i] = left[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i] = right[i+1]*nums[i];
        }

        op[0] = right[1];
        op[nums.length-1] = left[nums.length-2];

        for(int i=1;i<nums.length-1;i++)
        {
            op[i]=left[i-1]*right[i+1];
        }
        return op;

    }
}
