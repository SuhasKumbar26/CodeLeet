class Solution {
    public boolean checkPerfectNumber(int n) {
        int ans = 0;
        int counter = 1;
        while (counter < n) {
            if (n % counter == 0)
                ans += counter;
            counter++;
        }

        return ans == n;
    }
}