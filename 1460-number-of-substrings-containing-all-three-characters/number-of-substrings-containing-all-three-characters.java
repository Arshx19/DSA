class Solution {
    public int numberOfSubstrings(String s) {
        int frq[] = new int[3];
        int le =0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']++;
            while(frq[0]>0 && frq[1]>0 && frq[2]>0){
                frq[s.charAt(le)-'a']--;
                le++;
            }
            ans+=le;
        }
        return ans;
    }
}