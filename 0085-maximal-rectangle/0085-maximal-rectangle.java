class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == '1'){
                    heights[j] += Integer.parseInt(Character.toString(matrix[i][j]));
                }
                else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea,maxRect(heights));
        }
        return maxArea;
    }

    int maxRect(int[] heights){
        int k = heights.length;
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i<k; i++){
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
            int area = temp[1] * (k - temp[0]);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}