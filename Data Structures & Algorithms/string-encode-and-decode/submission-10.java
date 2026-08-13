class Solution {

     public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length())
              .append("#")
              .append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            // Find '#'
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            // Get length
            int len = Integer.parseInt(s.substring(i, j));

            // Get string
            String str = s.substring(j + 1, j + 1 + len);

            result.add(str);

            // Move to next encoded string
            i = j + 1 + len;
        }

        return result;
    }
}
