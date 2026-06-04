class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(char c : jewels.toCharArray()){
            map.put(c,1);
        }
        int count =0;
        for(char ch : stones.toCharArray()){
            if(map.containsKey(ch)){
                count++;
            }
        }
        return count;
    }
}