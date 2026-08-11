class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0 ) +1 );
        }

        for (Character c : t.toCharArray()){
            if (!map.containsKey(c))
                return false;
            else {
               if(map.get(c) == 1)
                 map.remove(c);
               else {
                   int newCount = map.get(c) -1;
                   map.remove(c);
                   map.put(c, newCount);
               }
            }
        }

        return true;
    }
}
