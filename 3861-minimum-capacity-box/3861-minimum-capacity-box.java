class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(capacity[i]>=itemSize){
                min = Math.min(capacity[i], min);
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(capacity[i] == min){
                ans=i;
                break;
            }
        }
        return ans;
    }
}