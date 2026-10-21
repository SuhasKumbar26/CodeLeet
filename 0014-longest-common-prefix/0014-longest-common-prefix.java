class Solution {
    public String longestCommonPrefix(String[] str) {
        String prefix = str[0];
        for(int i = 0; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                if (prefix.length() == 0) return "";
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}