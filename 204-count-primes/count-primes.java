class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int [] pr = new int[n];
        pr[0] = pr[1]=1; // 0 and 1 are not prime number
        for(int i=2;i*i<pr.length;i++){
            if(pr[i]==0){ // ye prime hai 
                for(int j=2;i*j<pr.length;j++){
                    pr[i*j]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<pr.length;i++){
            if(pr[i]==0){
                count++;
            }
        }
        return count;
    }
    
}