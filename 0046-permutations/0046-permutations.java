class Solution {

    private void swap(int x, int y, int[] arr){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }

    private void generatePer(int[] arr, int idx, List<List<Integer>> ans){

        if(idx == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i: arr) ds.add(i);
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            swap(idx, i, arr);
            generatePer(arr, idx+1, ans);
            swap(idx, i, arr);
        }
    }



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generatePer(nums, 0, ans);
        return ans;
    }
}