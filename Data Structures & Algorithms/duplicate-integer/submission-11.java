class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        Integer exist;
        for(int e : nums){
            exist = map.put(e, 1);
            if(exist != null) return true;
        }

        return false;
    }
}