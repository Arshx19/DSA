class Solution {
    public int[] singleNumber(int[] nums) {
        int res[] = new int[2];
        int idx =0;
        for(int i=0;i<nums.length;i++){
            boolean fl=false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                fl = true;
                break;
                }
            }
            if(!fl){
                res[idx] = nums[i];
                idx++;
                if(idx ==2){
                    break;
                }
            }
        }
        return res;
    }
}