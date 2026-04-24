class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int s=0;
        for(char c: moves.toCharArray()){
            if(c=='L'){
                l++;
            }
            else if(c=='R'){
                r++;
            }
            else{
                s++;
            }
        }
        return Math.abs(r-l)+s;
    }
}