class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int i: bills){
            if(i == 5) five++;
            else{
                // 10 or 20
                if(i == 10){
                    ten++;
                    five--;
                    if(five < 0) return false;
                } else{
                    // 20
                    if(ten >= 1 && five >= 1){
                        five--;
                        ten--;
                        // if(five < 0 || ten < 0) return false;
                    }else if(five >= 3){
                        five -= 3;
                        // if(five < 0) return false;
                    }
                     else return false;
                }
            }
        }
        return true;
    }
}