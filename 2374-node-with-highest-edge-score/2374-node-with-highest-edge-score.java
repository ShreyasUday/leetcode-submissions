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
        }
        return res;
    }
}

/*
    1. make an array 'weight' and then store the value of the node from the edges where the current node is pointing.
    2. then traverse it to get the maximun value from it and its index
*/