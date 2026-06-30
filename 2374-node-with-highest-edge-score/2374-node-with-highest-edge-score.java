class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] weight = new long[n];

        for(int i = 0; i<n; i++){
            if(edges[i] != -1){
                weight[edges[i]] += i;
            }
        }

        long max = -1;
        int res = -1;
        for(int i = 0; i<n; i++){
            if(max<weight[i]){
                max = weight[i];
                res = i;
            }
            // max = Math.max(max,weight[i]);
        }
        return res;
    }
}