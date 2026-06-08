class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int l = 0;
        Stack<String> stack = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a + b));
            } else if (t.equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b - a));
            } else if (t.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a * b));
            } else if (t.equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b / a));
            } else {
                stack.push(t);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}