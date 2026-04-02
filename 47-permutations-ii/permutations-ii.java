class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permu(nums,res,0);
        return res;
        
    }
    public void permu(int []nums, List<List<Integer>> res, int start  ){
        if(start==nums.length){
            List<Integer> List = new ArrayList<>();
            for(int i:nums){
                List.add(i);
            }
            res.add(List);
            return ;

        }
        for(int i=start;i<nums.length;i++){
            if(shouldSkip(nums, start, i)){
                continue;
            }
            swap(nums,start,i);
            permu(nums,res,start+1);
            swap(nums,start,i);
        }
    }
    public boolean shouldSkip(int[] nums, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (nums[i] == nums[curr]) return true;
        }
        return false;
    }
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}