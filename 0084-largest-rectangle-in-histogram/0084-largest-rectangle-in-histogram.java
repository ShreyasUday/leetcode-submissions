class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i<n; i++){
            int index = i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]){
                int[] temp = stack.pop();
                int area = temp[1] * (i - temp[0]);
                maxArea = Math.max(maxArea,area);
                index = temp[0];
            }
            stack.push(new int[]{index,heights[i]});
        }

        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            int area = temp[1] * (n - temp[0]);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}