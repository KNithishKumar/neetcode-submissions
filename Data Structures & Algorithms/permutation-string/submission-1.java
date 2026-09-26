class Solution {
    public boolean checkInclusion(String s1, String s2) {

        ArrayList<Character> a = new ArrayList<>();

        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            a.add(c);
        }
        int left = 0;
        int right = s1.length()-1;

        boolean flag = false;
        int temp = 0;

        while(right<s2.length())
        {

            ArrayList<Character> t = new ArrayList<>(a);

            int count=0;
            for(int i=left;i<=right;i++)
            {
                if(t.contains(s2.charAt(i)))
                {
                    count++;
                    t.remove(t.indexOf(s2.charAt(i)));
                }
            }

            if(count==s1.length())
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
