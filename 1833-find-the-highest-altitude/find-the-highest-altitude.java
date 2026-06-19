class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int []arr =new int[n+1];
        for(int i=0;i<n;i++){
            arr[i+1]= arr[i]+gain[i];
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}