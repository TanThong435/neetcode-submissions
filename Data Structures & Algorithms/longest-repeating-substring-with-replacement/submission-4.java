class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left =0 , maxFreq =0, maxLength =0;
        int right = 0;
        while(right < s.length()) {
            int current = s.charAt(right) - 'A';
            count[current] ++;

            maxFreq = Math.max(maxFreq, count[current]);

            while ((right-left+1) - maxFreq > k){
                count[s.charAt(left) - 'A'] --;
                left++;
            }
            maxLength = Math.max(maxLength, right-left +1);

            right++;
        }
        return maxLength;
    }
}
