class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String , Integer> map = new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            String row="";
            for(int j=0;j<n;j++){
                row+=grid[i][j] +',';
            }
            map.put(row,map.getOrDefault(row,0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            String col ="";
            for(int j=0;j<n;j++){
                col+=grid[j][i]+',';
            }
            ans+=map.getOrDefault(col,0);
        }
        return ans;
        
    }
}