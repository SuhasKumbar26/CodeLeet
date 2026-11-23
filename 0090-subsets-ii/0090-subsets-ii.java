class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        getSubsets(nums, 0, cur, ans);
        return ans;
    }

    private void getSubsets(int[] nums, int i, List<Integer> cur ,List<List<Integer>> ans){
        //base case
        if(i == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }

        // self work 
        cur.add(nums[i]);
        getSubsets(nums, i+1, cur, ans);

        // remove 
        cur.remove(cur.size()-1);

        int idx = i;

        // skip next duplicates
        while(idx < nums.length-1 && nums[idx] == nums[idx+1]) idx++;

        getSubsets(nums, idx+1, cur, ans);
    }
}