class Solution {
    public boolean checkGoodInteger(int n) {
        int temp = n;
        int sum=0;
        int sqsum=0;
        while(temp>0){
            int rem= temp%10;
            sum =sum +rem;
            sqsum = sqsum + (rem*rem);
            temp/=10;
        }
        if(sqsum-sum>=50){
            return true;
        }
        return false;
    }
    
}