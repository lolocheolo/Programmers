class Solution {
    public String solution(String str1, String str2) {
        //결과를 저장할 문자열 변수 선언
        String answer = "";
        
        //첫 번째 문자열의 길이만큼 반복(str1 길이= str2 길이)
        for(int i=0; i<str1.length(); i++)
        {
            //answer 변수에 str1,str2의 i번째 문자를 차례대로 저장
            //단 str1,str2의 길이가 같을때만 가능, 다를 시 오류 발생
            answer= answer + str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }
}