class Solution {
    public String minWindow(String s, String t) {
        int  minLength = Integer.MAX_VALUE , left =0 , start = 0,
                formed =0, required ;

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0 ) +1);
        }
        required = tMap.size();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (tMap.containsKey(current)){
                window.put(current, window.getOrDefault(current, 0) +1);

                if (window.get(current).equals(tMap.get(current))){
                    formed ++;
                }

            }

            while (formed == required){
                int  currentLength = right-left +1;

                if (currentLength < minLength){
                    start = left;
                    minLength = currentLength;
                }

                char leftChar = s.charAt(left);
                if (tMap.containsKey(leftChar)){
                    window.put(leftChar, window.getOrDefault(leftChar, 0) -1);

                    if (window.get(leftChar) < tMap.get(leftChar)){
                        formed--;
                    }
                 }
                left ++;
            }

        }

        if (minLength == Integer.MAX_VALUE) return "";

        return s.substring(start, start +minLength);
    }
}
