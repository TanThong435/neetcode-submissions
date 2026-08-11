class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
   
        for(int e : nums){
           // if(map.put(e, 1) != null) return true;
           if(!map.containsKey(e))
         { 
            map.put(e,1);
         }
            else return true;
        }

        return false;
    }
}