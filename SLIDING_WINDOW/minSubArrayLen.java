public class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int low = 0, high = 0, sum = 0, result = Integer.MAX_VALUE;
        boolean flag = false;
        while(high < arr.length){
            sum = sum + arr[high];
            
            while(sum >= target){
                int len = high - low + 1;
                low++;
                sum = sum - arr[low-1]; 
                result = Math.min(len,result);
                flag = true;
            }
            high++;
        }
        return flag?result:0;
    }
} {
    
}
