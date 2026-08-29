class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> s = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
            s.add(nums[i]);
       }

       ArrayList<Integer> a = new ArrayList<>(s);
       Collections.sort(a);
       int max = 0;
       int count = 0; 
       for(int i=0;i<a.size()-1;i++)
       {
        if(a.get(i+1)==a.get(i)+1)
        {
            count = count+1;
        }
        else
        {
            count = 0;
        }
        max = Math.max(max,count);
       }
        if(nums.length==0)
        {
            return 0;
        }
        else
        {
            return max+1;
        }

    }
}
