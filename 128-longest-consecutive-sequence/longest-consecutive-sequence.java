class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int l=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int temp =num;
                int len=1;
                while(set.contains(temp+1)){
                    temp++;
                    len++;
                }
                l=Math.max(len,l);
            }
        }
        return l;
    }
}