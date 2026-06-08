class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                l2.add(nums[i]);
            }
            else{
                l3.add(nums[i]);
            }
        }
        int []res = new int[n];
        int k=0;
        for(int x:l1){
            res[k++]=x;
        }
        for(int x:l2){
            res[k++]=x;
        }
        for(int x:l3){
            res[k++]=x;
        }
        return res;
    }
}