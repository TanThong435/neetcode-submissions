class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 
        if (s.isEmpty()) return 0;
        if (s.length() ==1) return 1;
        
        int left = 0, right =1 ;
        int mazSize =0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(left));

        while (right < s.length()){

            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
            }
            mazSize = Math.max(mazSize, set.size());

        }

        return mazSize ;
    }
}
