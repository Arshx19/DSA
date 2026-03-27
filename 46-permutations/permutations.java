class Solution {
    public List<List<Integer>> permute(int[] nums) {
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
            swap(nums,start,i);
            permu(nums,res,start+1);
            swap(nums,start,i);
        }
    }
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}