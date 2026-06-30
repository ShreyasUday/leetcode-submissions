class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int sum = temp1 + temp2;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(sum);
            }
            else if(op.equals("D")){
                int temp = stack.peek();
                stack.push(2*temp);
            }
            else if(op.equals("C")){
                int rm = stack.pop();
            }
            else{
                int num = Integer.parseInt(op);
                stack.push(num);
            }
        }

        int res = 0;

        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}
/*
1. Integer.parseInt()
*/