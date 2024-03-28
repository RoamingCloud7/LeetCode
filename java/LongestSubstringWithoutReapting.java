
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        if (s.length() == 0) return res;
        int left = 0, right = 0;
        Map<Character, Integer> table = new HashMap<>();
        while (right < s.length()) {
            if (table.containsKey(s.charAt(right))) {
                left = Math.max(left, table.get(s.charAt(right)) + 1);
            }
            table.put(s.charAt(right), right);
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}