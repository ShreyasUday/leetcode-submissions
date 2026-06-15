public class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder(s);
        int n = str.length();
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            else if(str.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    str.setCharAt(i,'\0');
                }
            }
        }

        while(!stack.isEmpty()){
            str.setCharAt(stack.pop(),'\0');
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != '\0'){
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}