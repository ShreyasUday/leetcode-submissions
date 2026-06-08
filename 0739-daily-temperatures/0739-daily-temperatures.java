public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>();
        int[] answer = new int[n];

        for(int i = 0; i<n; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0] < t){
                int[] temp = stack.pop();
                answer[temp[1]] = i - temp[1];
            }
            stack.push(new int[]{t,i});
        }
        return answer;
    }
}