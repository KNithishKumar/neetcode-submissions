class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append(freq[i]).append("#");
            }

            String k = key.toString();

            if (!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }

            map.get(k).add(str);
        }

        return new ArrayList<>(map.values());
    }
}