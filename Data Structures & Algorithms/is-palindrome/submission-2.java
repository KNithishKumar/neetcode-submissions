class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left<right)
        {
        
                  while(left<right && Character.isLetterOrDigit(s.charAt(left))==false)
            {
                left++;
            }
                 while(left<right && Character.isLetterOrDigit(s.charAt(right))==false)
            {
                right--;
            }
        
            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));
            
            if(a!=b)
            {
                return false;
            }
            else
            left++;
            right--;
        }
        
            return true;
    }
}
