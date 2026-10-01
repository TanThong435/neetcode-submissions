class Solution {
    public String minWindow(String s, String t) {
        int[] tMap = new int[128];
        int[] window = new int[128];
        int left =0 , start =0 , minLength = Integer.MAX_VALUE;
        int require = 0;
        int formed = 0;
        
        for (char c : t.toCharArray()){
            if (tMap[c] ==0)
            { require++; }
            tMap[c] ++;
        }

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (tMap[current] > 0){
                window[current] ++;

                if (window[current] == tMap[current]){
                    formed ++;
                }
            }

            // find window  > go shink window
            while (formed == require){
                int currentLength = right-left+1;
                if (currentLength < minLength) {
                    start = left;
                    minLength = currentLength;
                }
                char leftChar = s.charAt(left);

                if (tMap[leftChar] > 0){
                    window[leftChar] --;

                    if (window[leftChar] < tMap[leftChar]){
                        formed --;
                    }
                }

                left ++;
            }

        }

        if (minLength == Integer.MAX_VALUE) return "";
        return s.substring(start, start+ minLength);
    
    }
}
