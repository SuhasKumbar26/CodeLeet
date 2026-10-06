class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0;
        int closeNeeded = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                closeNeeded++;
            } else {
                if (closeNeeded > 0) {
                    closeNeeded--; // Matched with an existing '('
                } else {
                    openNeeded++;  // Unmatched ')' needs a '(' in front
                }
            }
        }
        
        return openNeeded + closeNeeded;
    }
}