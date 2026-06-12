class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<int[]> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek()[0] == c){
                stk.peek()[1]++;
            }
            else{
                stk.push(new int[]{c,1});
            }
            if(stk.peek()[1] == k){
                stk.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()){
            int[] temp = stk.pop();
            for(int i = 0; i<temp[1]; i++){
                str.append((char)temp[0]);
            }
        }
        return str.reverse().toString();
    }
}