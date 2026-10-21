class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //your code goes here
        int[] frq = new int[26];

        for(int i = 0; i < s.length(); i++){
          int sIdx = 122 - s.charAt(i);
          int tIdx = 122 - t.charAt(i);
          frq[sIdx]++;
          frq[tIdx]--;
        }

        for(int i: frq){
          if(i < 0) return false;
        }
        return true;
    }
}