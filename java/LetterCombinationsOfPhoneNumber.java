class Solution {
    List<String> combinations = new ArrayList<String>();
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return combinations;
        backtrack(digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(String digits, int index, StringBuffer combination) {
        if (combination.length() == digits.length()) {
            combinations.add(combination.toString());
            return;
        }
        String letters = phoneMap.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); ++i) {
            combination.append(letters.charAt(i));
            backtrack(digits, index + 1, combination);
            combination.deleteCharAt(index);
        }
    }

}