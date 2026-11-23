class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        subSetFun(nums, set, cur, 0);
        return set;
    }

    private void subSetFun(int[] arr, List<List<Integer>> set, List<Integer> cur , int idx){
        if(idx == arr.length){
            set.add(new ArrayList<>(cur));
            return;
        }

        // Take
        cur.add(arr[idx]);
        subSetFun(arr, set, cur, idx+1);

        // Undo the taken
        cur.remove(cur.size()-1);
        
        // Dont take 
        subSetFun(arr, set, cur,  idx+1);
    }
}