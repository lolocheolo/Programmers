//전화번호 뒷자리 4자리 제외 *으로 표시

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //핸드폰 번호 한글자씩 문자열 배열에 저장
        String []arr=phone_number.split("");
        
        //뒷자리 4자리 제외하고 *로 바꾸기
        for(int i=0; i< arr.length-4; i++){
            arr[i]="*";
        }
        
        //문자열 배열을 하나의 문자열로 변환
        //빈 문자열을 구분자로 사용하여 문자열 배열의 값들이 구분자 없이 그대로 연결되어 저장
        answer= String.join("",arr);
        
        return answer;
    }
}