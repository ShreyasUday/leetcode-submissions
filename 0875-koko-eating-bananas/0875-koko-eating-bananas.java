class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            high = Math.max(high, piles[i]);
        }
        int res = high;
        while(low<=high){
            int mid = low + (high - low)/2;
            long time = 0;
            for(int i = 0; i<n; i++){
                time += (piles[i]+mid-1)/mid;
            }
            if(time>h){
                low = mid+1;
            }
            else{
                res = Math.min(res,mid);
                high = mid-1;
            }

        }
        return res;
    }
}