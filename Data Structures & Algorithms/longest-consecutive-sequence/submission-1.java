class Solution {
    public int longestConsecutive(int[] nums) {
         nums=  Arrays.stream(nums).distinct().sorted().toArray();
      List<List<Integer>> fillData = new ArrayList<>();

            List<Integer> temp = new ArrayList<>();
            int i = 0;
            while (i < nums.length){
               if(i+1 == nums.length){
                   temp.add(nums[i]);
                   break;
               }

                if ( nums[i+1] - nums[i] == 1) {
                    temp.add(nums[i]);
                } else {
                    temp.add(nums[i]);
                    fillData.add(temp);
                    temp = new ArrayList<>();
                }
                i+=1;
            }
            fillData.add(temp);

        int max =0;
        for (List<Integer> list : fillData){
            if (max < list.size()){
                max = list.size();
            }
        }
        return max;
    }
}
