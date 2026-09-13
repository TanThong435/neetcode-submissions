class Solution {
    public int characterReplacement(String s, int k) {
         int[] count = new int[128];
        int left = 0, maxLength = 0, maxFreq = 0; // maxLength for return

        for (int right = 0; right < s.length(); right++) {
            // get current
            int current = s.charAt(right);
            // increase count of current
            count[current]++;

            // set max freq
            maxFreq = Math.max(maxFreq, count[current]);

            while ((right - left + 1 - maxFreq) > k) {
                count[s.charAt(left)] --;
                left++;
            }
            //
            maxLength = Math.max(maxLength, right-left+1);

        }


        return maxLength;
    }
}
