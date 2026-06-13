class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),weights[i]);
        }
        String ans = "";
        for(String word:words){
            int sum=0;
            for(char ch:word.toCharArray()){
                sum+=map.get(ch);
            }
            int mod = sum%26;
            ans+=(char)('z'-mod);
        }
        return ans;
    }
}