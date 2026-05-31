class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int l = 0;
        int h = 0;

        for(int w : weights){
            l = Math.max(l,w);
            h += w;
        }

        int res = h;

        while(l<=h){
            int cap = l + (h-l)/2;
            int ship = 1;
            int currCap = cap;
            for(int w : weights){
                if(currCap - w < 0){
                    ship++;
                    currCap = cap;
                }
                currCap -= w;
            }
            if(ship>days){
                l = cap+1;
            }
            else{
                res = Math.min(res,cap);
                h = cap-1;
            }
        }
        return res;
    }
}