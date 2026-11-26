class Solution {

    private boolean canEatAll(int[] piles, int mid, int h){
        int actualTime = 0;
        for(int i: piles){
            actualTime += (i / mid);

            if(i%mid != 0){
                actualTime++;
            }
        }

        return actualTime <= h;
    } 

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;

        for(int i: piles){
            r = Math.max(r, i);
        }

        while(l < r){
            int mid = l + (r - l)/2;
            if(canEatAll(piles, mid, h)){
                r = mid;
            } else{
                l = mid + 1;
            }
        }

        return l;

    }
}