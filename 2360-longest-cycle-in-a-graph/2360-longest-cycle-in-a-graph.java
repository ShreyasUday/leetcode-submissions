class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] visited = new boolean[n];
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

/*
    1. first, create a visited array which will tell you which node is processed.
    2. next, loop from 0 to n (size of edges)
    3. for every node (iteration) create a map which will store node and time to reach that node.
    4. run one more loop with conditions like node not -1 and not visited and not in map.
    5. after this internal loop check if the node is -1 or not if NO, then calculate the current time for the loop from --> currTime( which is 'time' for that iteration ) - time at the current node (from map)
*/