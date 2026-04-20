class Solution {
    public int maxDistance(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            if(nums[i]!=nums[j]){
                max=Math.max(max,j-i);          
                break;
            }
            j--;
        }
        i=0;
        j=nums.length-1;
        while(i<j){
            if(nums[i] != nums[j]){
                max=Math.max(max,j-i);
                break;
            }
            i++;
        }

        return max;
    }
}