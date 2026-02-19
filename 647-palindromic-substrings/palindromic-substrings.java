class Solution {
    public int countSubstrings(String s) {
        return pal_sub(s);
    }
    public static int pal_sub(String str){
        //ODD
        int odd =0;
        for(int i=0;i<str.length();i++){
            for(int n=0;i-n>=0 && n+i<str.length();n++){
                if(str.charAt(i-n) !=str.charAt(i+n)){
                    break;
                }
                odd++;
            }
        }
        //EVEN
        int even =0;
        for(double i=0.5;i<str.length();i++){
            for(double n=0.5;i-n>=0 && n+i<str.length();n++){
                if(str.charAt((int)(i-n)) !=str.charAt((int)(i+n))){
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}