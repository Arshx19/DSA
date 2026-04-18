class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(c == '*'){
            if(!st.isEmpty()){
                st.pop();
            }
        } else {
            st.push(c);
        }
}
        char[] res = new char[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            res[i--] = st.pop();
        }
        return new String(res);
    }
}