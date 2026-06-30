class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        // int node = 0;
        boolean[] visited = new boolean[n];
        // Arrays.fill(visited,false);
        int res = -1;
        for(int i = 0; i<n; i++){
            if(visited[i] == true) continue;
            HashMap<Integer,Integer> map = new HashMap<>();
            int node  = i;
            int time = 1;
            while(node != -1 && visited[node] != true && !map.containsKey(node)){
                visited[node] = true;
                map.put(node,time);
                node = edges[node];
                time++;
            }
            if(node != -1 && map.containsKey(node)){
                int curr = time - map.get(node);
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}