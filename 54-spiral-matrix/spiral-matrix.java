class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int top =0;
        int bot=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(top<=bot && left <= right){
            // left -> right
            for(int i=left;i<=right;i++){
                ll.add(matrix[top][i]);
            }top++;
            //top -> bottom
            for(int i=top;i<=bot;i++){
                ll.add(matrix[i][right]);
            }right--;
            //right -> left
            if(top<=bot){
                for(int i=right;i>=left;i--){
                ll.add(matrix[bot][i]);
            }bot--;
            }
            //bot -> top
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    ll.add(matrix[i][left]);
                }left++;
            }
        }
        return ll;
    }
}