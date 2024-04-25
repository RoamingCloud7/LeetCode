class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return res;
    }
    public void backtrack(int open, int close, int max) {
        if (close == max) {
            res.add(path.toString());
            return;
        }
        if (open < max) {
            path.append('(');
            backtrack(open + 1, close, max);
            path.deleteCharAt(path.length() - 1);
        }
        if (close < open) {
            path.append(')');
            backtrack(open, close + 1, max);
            path.deleteCharAt(path.length() - 1);
        }
    }
}