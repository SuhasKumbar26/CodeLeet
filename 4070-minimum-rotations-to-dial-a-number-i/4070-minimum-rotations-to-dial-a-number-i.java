class Solution {
    public int minRotations(String s) {
        int ans = 0, prev = 0;

        for(int i = 0; i < s.length(); i++){
            int temp = s.charAt(i) - '0';
            int x1 = Math.abs(temp - prev);
            int x2 = 10 - Math.abs(temp - prev);
            ans += Math.min(x1, x2);
            prev = temp;
        }
        return ans;
    }
}