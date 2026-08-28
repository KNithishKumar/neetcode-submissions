class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] sf = new int[26];
        Arrays.fill(sf,0);


        for (int i = 0; i < s.length(); i++) {

            int d = (int)s.charAt(i) - 97;
            sf[d]+=1;
        }
        for (int i = 0; i < t.length(); i++) {
           int d = (int)t.charAt(i) - 97;
            sf[d]-=1;
            }
        int flag = 0;
        for(int i=0;i<26;i++)
        {
            if(sf[i]==0)
            {
                flag++;
            }
           
        }
        if(flag==26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}