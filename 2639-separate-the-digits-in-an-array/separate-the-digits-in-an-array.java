class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> ll2 = new ArrayList<>();
            while(nums[i]>0){
                int rem = nums[i]%10;
                ll2.add(rem);
                nums[i] = nums[i]/10;
            }
            for(int j=ll2.size()-1 ; j>=0;j--){
                ll.add(ll2.get(j));
            }
        }
        int []arr = new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i] = ll.get(i);
        }
        return arr;
    }
}