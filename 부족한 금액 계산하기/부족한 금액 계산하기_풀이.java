class Solution {
    public long solution(int price, int money, int count) {
        long answer;
        long sum = 0;
        
        for(int i=1; i<=count; i++){    //count ÀÚ¿¬¼ö
            sum = sum + price * i;
        }
        // if(sum - money > 0) {
        //     answer = sum - money;
        // } else answer = 0;
        
        answer = (sum > money) ? sum-money : 0;
        
        return answer;
    }
}