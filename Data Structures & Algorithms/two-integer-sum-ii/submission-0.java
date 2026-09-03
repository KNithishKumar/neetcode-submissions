class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left = 0;
         int right = numbers.length-1;

         ArrayList<Integer> res = new ArrayList<>();
         while(left<right)
         {

         int sum = numbers[left]+numbers[right];
         if(sum==target)
         {
            res.add(left+1);
            res.add(right+1);
            break;
         }
         else if(sum > target)
         {
            right--;
         }
         else
         {
            left++;
         }
         }

         int[] result = new int[2];

         for(int i=0;i<res.size();i++)
         {
            result[i]=res.get(i);
         }
         return result;

    }
}
