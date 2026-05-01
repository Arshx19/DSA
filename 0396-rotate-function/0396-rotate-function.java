class Solution {
    public int maxRotateFunction(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;

        // for(int i=0;i<n;i++){
        //     int curr =0;
        //     for(int j=0;j<n;j++){
        //         curr += j*nums[j];
        //     }
        //     max = Math.max(max,curr);
        //     int last = nums[n-1];
        //     for(int k=n-1;k>0;k--){
        //         nums[k] = nums[k-1];
        //     }
        //     nums[0] = last;
        // }
        // return max;

        int n = nums.length;

        long sum = 0;
        long f =0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            f += (long)i * nums[i];
        }

        long max =f;

        for(int k=1;k<n;k++){
            f = f + sum - (long)n * nums[n-k];
            max = Math.max(max,f);
        }

        return (int) max;
    }
}