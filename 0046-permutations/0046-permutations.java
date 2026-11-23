class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermute(nums, 0, ans);
        return ans;
    }

    private void getPermute(int[] nums, int idx, List<List<Integer>> ans){

        if(idx == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i: nums) ds.add(i);
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx; i < nums.length; i++){
            swap(idx, i, nums);
            getPermute(nums, idx+1, ans);
            swap(idx, i, nums);
        }
    }

    private void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}