class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ark) {
        int[] diff = new int[capacity.length];
        Arrays.fill(diff, 0);

        for (int i = 0; i < capacity.length; i++) {
            diff[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(diff);

        int count = 0;
        for (int i : diff) {
            if (i > 0 && ark >= i) {
                ark = ark - i;
                count++;
            } else if (i == 0) count++;
            // else break;
        }

        return count;
    }
}