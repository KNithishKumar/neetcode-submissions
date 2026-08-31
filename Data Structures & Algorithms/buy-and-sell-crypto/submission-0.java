class Solution {
    public int maxProfit(int[] prices) {

        int mp = 0;
        int flag = 1;
        int max = 0;

        for(int i=0;i<prices.length;i++)
        {
    
           for(int j=i+1;j<prices.length;j++) 
           {

            int diff = prices[j]-prices[i];

            if(diff>0)
            {
                mp = Math.max(mp,prices[j]-prices[i]);
            }

           }

           max = Math.max(max,mp);
        }

        return max;
        
    }
}
