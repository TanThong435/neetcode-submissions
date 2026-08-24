class Solution {
    public int lengthOfLongestSubstring(String s) {
        if("".equals(s)) return 0;
        if(s.isBlank() || s.length() ==1) return 1;

        int left =0, right =1 , maxSize =0;
        Set<Character> data = new HashSet<>();
        data.add(s.charAt(left));

        while (right < s.length()){

            if (data.contains(s.charAt(right))){
               // maxSize = Math.max(maxSize, data.size());
                while (data.contains(s.charAt(right))){
                    data.remove(s.charAt(left));
                    left++;
                }
            } else {
                data.add(s.charAt(right));
                right++;
            }
            maxSize = Math.max(maxSize, data.size());
        }
        return maxSize;
    }
}
