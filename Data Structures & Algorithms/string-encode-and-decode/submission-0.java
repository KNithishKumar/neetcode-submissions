class Solution {

    ArrayList<Integer> count = new ArrayList<>();

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        count.clear();

        for(int i=0;i<strs.size();i++)
        {
            count.add(strs.get(i).length());
            for(int j=0;j<strs.get(i).length();j++)
            {
            char c = strs.get(i).charAt(j);
            int assci = (int)c + 1;
            char fc = (char)assci;
            sb.append(fc);
            }
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> op = new ArrayList<>();
        int index = 0;
    for(int k = 0;k<count.size();k++)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<count.get(k);i++)
        {
            char c = str.charAt(index);
            int assci = (int)c - 1;
            char fc = (char)assci;
            sb.append(fc);

            index++;

        }
        op.add(sb.toString());
    }
        return op;
    }
}
