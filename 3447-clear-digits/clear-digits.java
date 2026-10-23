class Solution {
    public String clearDigits(String s) {
      Stack<Character> stack=new Stack<>();
     for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        String str = "";
        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }
}