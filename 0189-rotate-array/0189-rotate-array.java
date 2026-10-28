class Solution {
    public void rotateByk(int[] nums, int l, int r){
        while(l <= r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        rotateByk(nums, 0, n-k-1);
        rotateByk(nums, n-k, n-1);
        rotateByk(nums, 0, n-1);
    }
}