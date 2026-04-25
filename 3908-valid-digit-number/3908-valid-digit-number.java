class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        char c = (char)(x + '0');
        return s.indexOf(c) != -1 && s.charAt(0) != c;
    }
}