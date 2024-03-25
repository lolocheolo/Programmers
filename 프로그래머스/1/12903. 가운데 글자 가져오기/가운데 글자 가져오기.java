
class Solution {
    public String solution(String s) {
        String answer = "";
        int len=s.length();
        
        //짝수일때, 길이를 반으로 나눈 값의 앞뒤 숫자 저장
        if(len % 2==0){
            answer = Character.toString(s.charAt(len/2 - 1));
            answer = answer + s.charAt(len/ 2 );
        }
        //홀수일때, 가운데 숫자 저장
        // char타입의 값을 string 타입에는 직접 할당 불가능
        //chart 값을 string으로 변환 필요
        //1. Character.toString 함수 사용
        //2. 빈 문자열을 더하여 String으로 변환
        
        else{
            answer= ""+ s.charAt(len/2);
        }
        return answer;
    }
}