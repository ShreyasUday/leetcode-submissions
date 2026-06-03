class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int res = 0;
        Arrays.sort(cost);
        for(int i = n-1; i>=0; i-=3){
            res += cost[i];
            if(i-1 >= 0){
                res += cost[i-1];
            }
        }
        return res;
    }
}