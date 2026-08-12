class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap =new HashMap<>();

        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0 )+ 1);
        }
        // sort max > min
        freqMap = freqMap.entrySet().stream()
                .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (a,b) -> a, LinkedHashMap::new));

        List<Integer> result = freqMap.keySet().stream().toList();

        return result.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}
