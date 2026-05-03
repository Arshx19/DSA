class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int r=0;
        while(n>0){
            int digi = n%10;
            r=r*10 + digi;
            n/=10;
        }
        int max = Math.max(temp,r);
        int min = Math.min(temp,r);

        int count=0;
        for(int i=min;i<=max;i++){
            if(prime(i) == true){
                count = count+i;
            }
        }
        return count;   
    }
    public static boolean prime(int n){
        if(n<=1){
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