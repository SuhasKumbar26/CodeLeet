class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        // for(int i: gas) totalGas += i;
        // for(int i: cost) totalCost += i;
        // if(totalGas < totalCost) return -1;

        int curGas = 0, start = 0;

        for(int i = 0; i < gas.length; i++){
            curGas = curGas + gas[i] - cost[i];
            if(curGas < 0){
                start = (i+1)%gas.length;
                curGas = 0;
            }
            totalGas += gas[i];
            totalCost += cost[i];            
        }

        if(totalGas < totalCost) return -1;
        return start;
    }
}