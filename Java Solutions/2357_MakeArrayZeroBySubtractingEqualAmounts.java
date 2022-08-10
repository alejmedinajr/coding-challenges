class Solution {
    public int minimumOperations(int[] nums) {
        int numOperations = 0;
        boolean done = false;
        
        while(!done) {
            int min = 1000;

            for(int n: nums){
                if(n != 0) {
                    min = Math.min(min, n);
                }
            }
            boolean enteredChange = false;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0) {
                    enteredChange = true;
                    nums[i] -= min;   
                }
            }
            
            int sum = 0;
            for(int n: nums) {
                sum += n;       
            }
            
            done = (sum == 0);
            if(enteredChange) numOperations++;
 
        }
        return numOperations;
    }
}