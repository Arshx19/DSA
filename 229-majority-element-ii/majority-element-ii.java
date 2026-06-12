class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ll = new ArrayList<>();
        int frq = n/3;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>frq){
                ll.add(entry.getKey());
            }
        }
        return ll;
    }
}