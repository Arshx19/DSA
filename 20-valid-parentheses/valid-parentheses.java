import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                st.push(curr);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char ch = st.pop();

                if ((curr == ')' && ch == '(') || (curr == ']' && ch == '[') ||           (curr == '}' && ch == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}