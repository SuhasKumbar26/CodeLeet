class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
            String temp = strs[i];
            while(temp.indexOf(str) != 0){
                str = str.substring(0, str.length()-1);
                if (str.length() == 0) return "";
            }
        }
        return str;
    }
}