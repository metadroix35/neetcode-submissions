class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left =0;
        int right = 1;
        int res=0;
        while(right < n){
            if(prices[left] <= prices[right]){
                int profit = prices[right]- prices[left];
                res = Math.max(res,profit);
            }
            else {
                left = right;
            }
            right++;
        }
        return res;
        
    }
}
