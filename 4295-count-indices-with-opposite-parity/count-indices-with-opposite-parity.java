class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if((nums[i] %2) != (nums[j]%2)){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}