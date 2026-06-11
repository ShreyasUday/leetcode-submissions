class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gMax = nums[0];
        int gMin = nums[0];
        int cMax = 0;
        int cMin = 0;
        int max = 0;
        for(int num : nums){
            cMax = Math.max(cMax+num,num);
            cMin = Math.min(cMin+num,num);
            gMax = Math.max(gMax,cMax);
            gMin = Math.min(gMin,cMin);
            max += num;
        }
        return gMax > 0 ? Math.max(gMax,max - gMin) : gMax;
    }
}