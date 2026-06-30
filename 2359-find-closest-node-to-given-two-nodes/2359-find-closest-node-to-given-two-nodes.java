class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];

        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);

        distance(edges,node1,dist1);
        distance(edges,node2,dist2);

        int res = -1;
        int nd = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int d = 0;
            if(dist1[i] != -1 && dist2[i] != -1){
                d = Math.max(dist1[i],dist2[i]);
                if(nd > d){
                    nd = d;
                    res = i;
                }
            }
        }
        return res;
    }

    public void distance(int[]edges, int node, int[] dist){
        int i = 0;
        while(node != -1 && dist[node] == -1){
            i++;
            dist[node] = i;
            node = edges[node];
        }
    }
}