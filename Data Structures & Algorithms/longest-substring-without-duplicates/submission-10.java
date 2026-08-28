class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxSize =0;
        int[] chars = new int[128];
        int left = 0 ;

        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right);

            if (chars[c] == 0){
                maxSize = Math.max(maxSize, right-left +1);
            } else {
                while(chars[c] != 0){
                    chars[s.charAt(left++)] --;
                }
            }

            chars[c]++;
        }

        return maxSize;  
    }
}
