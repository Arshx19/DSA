class Solution {
    public String processStr(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >='a' && c<='z'){
                res= res+c;
            }
            else if(c =='*'){
                if(!res.isEmpty()){
                    res = res.substring(0,res.length()-1);
                }
            }
            else if(c=='#'){
                res = res+res;
            }
            else if(c=='%'){
                res =reverse(res);
            }
        }
        return res;
    }
    public String reverse(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}