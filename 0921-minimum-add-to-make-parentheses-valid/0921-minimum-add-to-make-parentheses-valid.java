class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0, closeNeeded = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                // here i have ( i need the ) this in future
                closeNeeded++;
            } else {
                // i have ) i'm checking do i have previously ( then --
                if(closeNeeded > 0){
                    closeNeeded--;
                } else{
                    // i don't had ( so im increasing 
                    openNeeded++;
                }
            }
        }

        return openNeeded + closeNeeded;
    }
}