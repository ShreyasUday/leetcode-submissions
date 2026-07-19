class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int checkOne = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                checkOne = 1;
        }
        if (checkOne == 0)
            return 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0 || nums[i] == 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i + 1;
        }
        return n + 1;
    }
}