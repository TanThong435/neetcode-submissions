class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        char[][] charS = new char[strs.length][strs.length];
        // to char + sort
        for (int i = 0; i < strs.length; i++) {
            charS[i] = strs[i].toCharArray();
            Arrays.sort(charS[i]);
        }

        // sorted to string
        String[] strSorted = new String[strs.length];
        for (int i = 0; i < charS.length; i++) {
            strSorted[i] = Arrays.toString(charS[i]);
        }

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            if(map.containsKey(strSorted[i])){
                List<String> newValue = new ArrayList<>(map.get(strSorted[i]));
                newValue.add(strs[i]);
                map.remove(strSorted[i]);
                map.put(strSorted[i], newValue);
            }
            else map.put(strSorted[i], Collections.singletonList(strs[i]));
        }
        
        return map.values().stream().toList();
    }
}
