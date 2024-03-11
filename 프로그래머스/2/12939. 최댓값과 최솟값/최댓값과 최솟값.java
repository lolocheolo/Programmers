// 문제설명: 1. 공백을 기준으로 나누어 각각의 숫자로 변환
// 문제설명: 2. 최솟값, 최대값을 찾아 반환

class Solution {
    public String solution(String s) {
        // 문자열 s를 공백을 기준으로 나누어 문자열 배열str에 저장
        String[]str = s.split(" ");
        
        //문자열 배열str에 저장된 값을 정수형 배열Arr로 저장 준비
        //그 크기는 문자열 배열의의 개수와 같음
        int[] Arr = new int [str.length];
        
    //여기서 0으로 초기화했다가 Arr에 저장된 값과 비교 하면서 문제 발생
    //더 좋은방법 찾아보기
        int max = -9999;
        int min = 9999;
        
        for(int i=0; i<str.length; i++){
        //문자열을 정수로 변환하여 정수형 배열로 저장
            Arr[i]=Integer.parseInt(str[i]);
            
        // max값과 Arr[i]값을 비교하여 더 큰값을 max에 저장
        // min값과 Arr[i]값을 비교하여 더 작은값을 min에 저장
            
            max = Math.max(Arr[i],max);
            min = Math.min(Arr[i],min);
            
        
        }
        //리턴값에 min +공백+ max 저장
            String answer = min+ " " +max;
            return answer;
    
    }
}