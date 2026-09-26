class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];

         for(int i=0;i<26;i++)
        {
            count[i]=0;
        }

        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)-'a']++;
        }
        int left = 0;
        int right = s1.length()-1;

        boolean flag = false;

        while(right<s2.length())
        {
            int c=0;
            int[] temp = count.clone();
            for(int i=left;i<=right;i++)
            {
                temp[s2.charAt(i)-'a']--;
            }

            for(int i=0;i<26;i++)
            {
            if(temp[i]==0)
            {
                c++;
            }
            }

            if(c==26)
            {
                return true;
            }
            else
            {
            
            
                left++;
                right++;
            }
        }

        return false;
    }
}
