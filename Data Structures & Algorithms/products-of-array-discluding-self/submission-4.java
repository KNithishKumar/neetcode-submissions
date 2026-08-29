class Solution {
    public int[] productExceptSelf(int[] nums) {

        int flag = 0;
        int[] op = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                flag+=1;
            }
        }

        if(flag>1)
        {return op;
        }
        if(flag==1)
        {
        int produ = 1;
        for(int h = 0;h<nums.length;h++)
        {
            if(nums[h]==0)
            {
                
            }
            else
            {
                produ*=nums[h];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                
            }
            else
            {
                op[i] = produ;
            }
        }
     }

     else
     {
        int prod = 1;
        for(int a=0;a<nums.length;a++)
        {
            prod*=nums[a];
        }

        for(int b=0;b<nums.length;b++)
        {
            op[b] = prod/nums[b];
        }

     }
        return op;
    }

}  
