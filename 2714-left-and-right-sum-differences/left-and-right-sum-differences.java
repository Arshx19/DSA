class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int []left =new int[n];
        int []right = new int[n];

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums[j];
                left[i] = sum;
            }
        }
        for(int i=0;i<n;i++){
            int sum2=0;
            for(int j=i+1;j<n;j++){
                sum2+=nums[j];
                right[i] = sum2;
            }
        }
        int []ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}