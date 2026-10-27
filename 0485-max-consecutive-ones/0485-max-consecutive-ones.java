class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max=0; 
        for(int a : nums){
            if(a == 1) count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(count, max);
    }
}