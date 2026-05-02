class Solution {
    public int rotatedDigits(int n) {
        int count =0;
        for(int i=1;i<=n;i++){
            int temp=i;
            int changed =-1;
            while(temp>0){
                int digi =temp%10;
                if(digi ==3 || digi==4 || digi == 7){
                    changed=-1;
                    break;
                }
                if(digi ==2 || digi ==5 || digi ==6 || digi ==9){
                    changed =1;
                }
                temp/=10;
            }
        if(changed ==1){
            count ++;
            }
        }
        return count;
    }
}