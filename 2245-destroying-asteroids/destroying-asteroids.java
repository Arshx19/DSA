class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        long mas = mass;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mas){
                mas+=arr[i];
            }else{
                return false;
            }
       } 
       return true;
    }
}