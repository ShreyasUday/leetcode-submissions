class Solution {
    // public int sumOfArray(int[] arr, int start, int index) {
    //     int n = arr.length;
    //     int sum = 0;

    //     for (int i = start; i <= index; i++) {
    //         sum += arr[i];
    //     }

    //     return sum;
    // }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        while(right<n){
            sum += nums[right];

            while(sum>=target){
                res = Math.min(res,right-left+1);
                sum -= nums[left];
                left++;
            }

            right++;
        }
        

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}