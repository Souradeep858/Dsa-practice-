class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
             if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();

    }
}