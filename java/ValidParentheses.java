class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> hashTable = new HashMap<>();
        hashTable.put(')', '(');
        hashTable.put(']', '[');
        hashTable.put('}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (hashTable.containsKey(c)) {
                if (stack.isEmpty() || !stack.pop().equals(hashTable.get(c))) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}