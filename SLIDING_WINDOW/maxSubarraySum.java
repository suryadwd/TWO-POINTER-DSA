class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int low = 0, high = k - 1, sum = 0;
        for(int i = 0; i <= high; i++) sum = sum + arr[i]; // f w s
        int result = sum;
        while(high < arr.length){
            low++;
            high++; //window bhadaya
            if(high >= arr.length) break;
            sum = sum - arr[low-1] + arr[high];
            result = Math.max(result,sum);
        }
        return result;
    }
}