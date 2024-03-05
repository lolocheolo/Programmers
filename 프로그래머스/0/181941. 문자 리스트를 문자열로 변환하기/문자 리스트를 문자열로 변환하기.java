class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        //문자열 배열 arr의 길이만큼 반복
        for(int i=0; i<arr.length; i++){
            
           //현재 배열 인덱스에 해당하는 문자열을 결과 문자열에 추가
            answer=answer+arr[i];
        }
        //모든 문자열이 추가 된 결과 문자열 반환
        return answer;
    }
}