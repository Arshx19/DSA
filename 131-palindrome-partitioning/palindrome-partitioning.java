class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        part(s, ll, ans);
        return ans;
    }
    public void part(String ques, List<String> ll, List<List<String>> ans) {

        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {

            String str = ques.substring(0, i);

            if (pal(str)) {
                ll.add(str);
                part(ques.substring(i), ll, ans);
                ll.remove(ll.size() - 1);   // backtracking
            }
        }
    }

    public boolean pal(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}