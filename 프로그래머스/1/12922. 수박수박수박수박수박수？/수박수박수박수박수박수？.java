class Solution {
    public String solution(int n) {
        String answer = "";
        
        //수박수박 반복문
        for(int i=1; i<=n; i++){
            //홀수 자리에는 수
            //짝수 자리에는 박
            if(i%2!=0){
                answer=answer+"수";
            } else{
                answer=answer+"박";
            }
        }
        return answer;
    }
}