//피보나치 수열을 구하고 n번째 피보나치수를 반환

class Solution {
    public int solution(int n) {
        //배열 fibo는 n+1크기를 가짐
        int[] fibo = new int[n+1];
        
        //피보나치 초기 값
        fibo[0] = 0;
        fibo[1] = 1;
        
        //반복문을 통해 세번째부터 n번쨰 피보나치 수를 구하기
        //현재의 피보나치수는 이전,그이전 값의 합
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }
        
        //최종값 반환
        return fibo[n];
    }
}