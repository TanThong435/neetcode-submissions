class Solution {
    public boolean isValid(String s) {
         if (s.length() % 2 ==1) return false;

        List<Character> patterns = List.of('{', '(', '[');
        Map<Character, Character> closePattern = Map.of('}','{' , ']', '[', ')', '(');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (patterns.contains(c)) { // push open 
                stack.push(c);
            } else {
                if (stack.isEmpty() || !stack.pop().equals(closePattern.get(c))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
