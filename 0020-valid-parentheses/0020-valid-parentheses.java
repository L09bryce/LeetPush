class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if( n == 1)return false;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(st.isEmpty())return false;
                if((c == ')' && st.peek() !=  '(') || (c == ']' && st.peek() !=  '[') || (c == '}' && st.peek() !=  '{')){
                    return false;
                }
                st.pop();
            }
        }
        return true;
    }
}