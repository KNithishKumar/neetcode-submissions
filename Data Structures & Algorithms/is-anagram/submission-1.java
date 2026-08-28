class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> c = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            c.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);

            if (c.contains(ch)) {
                c.remove(ch);
            } else {
                return false;
            }
        }

        return c.isEmpty();
    }
}