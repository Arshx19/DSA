class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(prime(nums[i])){
                j=i;
                break;
            }
        }
        int k=0;
        for(int i=n-1;i>=0;i--){
            if(prime(nums[i])){
                k=i;
                break;
            }
        }
        return Math.abs(k-j);
    }
    public static boolean prime(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}