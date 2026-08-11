class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> map = new Hashtable();
        Integer exist;
        for(int e : nums){
            exist = map.put(e, 1);
            if(exist != null) return true;
        }

        return false;
    }
}