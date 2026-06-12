class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}