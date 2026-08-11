class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

      map = map.entrySet().stream()
                .sorted((a,b) ->Integer.compare(b.getValue(),a.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        List<Integer> result = new ArrayList<>(map.keySet());

        return result.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}
