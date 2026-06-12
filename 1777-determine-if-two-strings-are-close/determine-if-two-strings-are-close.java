class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch:word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char chh:word2.toCharArray()){
            map2.put(chh,map2.getOrDefault(chh,0)+1);
        }
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        List<Integer> ll1 = new ArrayList<>(map1.values());
        List<Integer> ll2 = new ArrayList<>(map2.values());

        Collections.sort(ll1);
        Collections.sort(ll2);

        return ll1.equals(ll2);
    }
}