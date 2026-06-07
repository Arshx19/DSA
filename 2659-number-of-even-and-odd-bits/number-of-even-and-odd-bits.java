class Solution {
    public int[] evenOddBit(int n) {
        int temp=n;
        String rem="";
        while(temp>0){
            int dg = temp%2;
            rem = rem+dg;
            temp/=2;
        }
        int even=0;
        int odd=0;
        for(int i=0;i<rem.length();i++){
            if(rem.charAt(i)=='1' && i%2==0){
                even++;
            }
            else if(rem.charAt(i)=='1' && i%2!=0){
                odd++;
            }
        }
        return new int[]{even,odd};
    }
}