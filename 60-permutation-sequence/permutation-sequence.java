class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        return permu(num, "", k, new int[]{0});
    }

    public String permu(List<Integer> num,String path,int k,int []count){
        if(num.size()==0){
            count[0]++;
            if(count[0]==k){
                return path;
            }
            return null;
        }
        for(int i=0;i<num.size();i++){
            int val= num.get(i);

            num.remove(i);
            String res= permu(num,path+val,k,count);
            if(res!=null){
                return res;
            }
            num.add(i,val);
        }
        return null;
    }
}