class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int f = 0;
        
        f = n / 10;   
        answer = (n * 12000) + (k * 2000) - (f * 2000);
        
        return answer;
    }
}