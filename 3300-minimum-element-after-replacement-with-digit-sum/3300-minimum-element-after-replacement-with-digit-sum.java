class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int temp = nums[i];
            int newVal = 0;
            while(temp!=0){
                newVal += temp%10;
                temp /= 10;
            }
            nums[i] = newVal;
        }

        int res = Integer.MAX_VALUE;

        for(int num : nums){
            res = Math.min(res,num);
        }
        return res;
    }
}