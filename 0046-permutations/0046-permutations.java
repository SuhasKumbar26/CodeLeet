class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        generatePer(nums, ds,  flag, ans);
        return ans;
    }

    private void generatePer(int[] nums, List<Integer> ds,  boolean[] flag, List<List<Integer>> ans){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!flag[i]){
                flag[i] = true;
                ds.add(nums[i]);
                generatePer(nums, ds, flag, ans);
                ds.remove(ds.size()-1);
                flag[i] = false;
            }
        }
    }
}