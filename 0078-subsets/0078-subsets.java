class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        backtrack(nums, 0, list, res);
        return res;
    }
    public void backtrack(int[] nums, int i, List<Integer> list, List<List<Integer>> res){
        if(i >= nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        backtrack(nums,i+1,list,res);
        list.remove(list.size() - 1);
        backtrack(nums,i+1,list,res);
    }
}