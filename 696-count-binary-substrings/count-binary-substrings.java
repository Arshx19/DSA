class Solution {
    public int countBinarySubstrings(String s) {
        int []arr = new int[s.length()];
        int a =0;
        arr[0]=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!= s.charAt(i-1)){
                arr[++a]=1;
            }
            else{
                arr[a]++;
            }
        }
        int res =0;
        for(int i=1;i<arr.length;i++){
            res +=Math.min(arr[i],arr[i-1]);
        }
        return res;
    }
}