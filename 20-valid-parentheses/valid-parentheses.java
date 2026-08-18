class Solution {
    public boolean isValid(String s) {
        // using stack because it using LIFO(last in first out )
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                    char p=stack.pop();
                    if((ch==')'&& p!='(') || (ch==']' && p!='[') || (ch=='}' && p!='{')) {
                        return false;
                    }
                }
            
        }
        return stack.isEmpty();
    }
}