class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        return binaryRec(nums, l, r, target);
    }

    public int binaryRec(int[] nums, int l, int r, int target){
        if(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                 l = mid+1;
                return binaryRec(nums, l, r, target);
            }
            else {
                r = mid-1;
                return binaryRec(nums, l, r, target);
            }
        }
        return -1;
    }
}