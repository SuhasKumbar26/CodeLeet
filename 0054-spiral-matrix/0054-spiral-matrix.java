class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;
        while (top <= bottom && left <= right) {
            //top left -> right
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            //right top -> bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            //bottom right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            //left bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}