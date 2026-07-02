class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int i = 0; i<n; i++){
            if(nums[high] != val){
                nums[low] = nums[high];
                high++;
                low++;
            }
            else{
                high++;
            }
        }
        return low;
    }
}