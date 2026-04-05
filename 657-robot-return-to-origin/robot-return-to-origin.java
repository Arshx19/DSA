class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y =0;

        char[] c = moves.toCharArray();

        for(char i:c){
            if(i =='U'){
                y++;
            }
            else if(i == 'D'){
                y--;
            }
            else if(i == 'L'){
                x++;
            }
            else{
                x--;
            }
        }
        return x==0 && y==0;
    }
}