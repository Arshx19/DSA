class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int arr[] = new int[2*n];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int j=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            arr[j] = nums[i];
            j++;
        }
        return arr;
    }
}