
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        //문자열 p를 정수화
       long pNum=Long.parseLong(p);
        
        //문자열 t에서 추출 가능한 p길이의 부분문자열 확인을 위해 반복
        for(int i=0; i<= t.length()- p.length(); i++){
            
        //t에서 시작인덱스 i로부터 p의 길이만큼의 부분 문자열 추출
            String sub = t.substring(i, i + p.length());
            
        //추출한 인덱스 sub를 정수화시켜서 정수화된 p와 숫자비교 후 answer 증가
            long num= Long.parseLong(sub);
            if(num<=pNum){
                answer++;
            }
        }
        return answer;
    }
}