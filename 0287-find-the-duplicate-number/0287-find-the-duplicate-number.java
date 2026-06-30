class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int node = 0;
        while(!visited[node]){
            visited[node] = true;
            node = nums[node];
        }
        return node;
    }
}