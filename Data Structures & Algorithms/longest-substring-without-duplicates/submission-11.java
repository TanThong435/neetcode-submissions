class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize =0;
        int left = 0, right =0;
        int[] chars = new int[128];

        while (right < s.length()){
            int n = s.charAt(right);
            if (chars[n] == 0){
                maxSize = Math.max(maxSize, right-left +1);
                chars[n] ++;
                right++;
            } else {
                while (chars[n] != 0){
                    chars[s.charAt(left++)] --;
                }
            }


        }

        return maxSize;
    }
}
