class Solution {
    public int minimumOperations(int[] arr) {
        int count =0;
        while(true){
            int min=Integer.MAX_VALUE;
            for(int i =0;i<arr.length;i++){
                if(arr[i]<min && arr[i]>0){
                    min=arr[i];
                }
            }
            if(min==Integer.MAX_VALUE){
                break;
            }

            for(int i =0;i<arr.length;i++){
                if(arr[i]>=min){
                    arr[i]=arr[i]-min;
                }
            }
            count++;
        }
        return count;
        
    }
}