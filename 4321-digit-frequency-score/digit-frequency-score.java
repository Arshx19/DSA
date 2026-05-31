class Solution {
    public int digitFrequencyScore(int n) {
        int frq[] = new int[10];
        while(n>0){
            int rem=n%10;
            frq[rem]++;
            n/=10;
        }
        int sum=0;
        for(int i=0;i<frq.length;i++){
            if(frq[i]>0){
                sum+=frq[i]*i;
            }
        }
        return sum;
    }
}