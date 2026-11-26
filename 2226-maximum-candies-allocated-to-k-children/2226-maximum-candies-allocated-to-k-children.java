class Solution {

    private boolean canIgive(int[] candies, int candy, long cld){
        long count = 0;

        for(int i: candies){
            count += (i/candy);
        }

        return count >= cld;
    }


    public int maximumCandies(int[] candies, long k) {
        int l = 1, r = 0;
        int ans = 0;

        for(int i: candies){
            r = Math.max(r, i);
            // l = Math.min(l, i);
        }

        while(l <= r){
            int mid = l + (r - l)/2;
            if(canIgive(candies, mid, k)){
                l = mid+1;
                ans = mid;
            } else{
                r = mid - 1;
            }
        }

        return ans;
    }
}