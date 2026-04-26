class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                if(nums[i]<=nums[j]){
                    l++;
                    break;
                }
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<=nums[j]){
                    r++;
                    break;
                }
            }
            if(l==0 || r==0){
                ll.add(nums[i]);
            }
        }
        return ll;
    }
}