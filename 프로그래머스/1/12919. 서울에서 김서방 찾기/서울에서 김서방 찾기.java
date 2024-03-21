class Solution {
    public String solution(String[] seoul) {
        // 김서방의 위치를 찾기 위해 for문 실행
        for (int i = 0; i < seoul.length; i++) {
            
            // 만약 현재 확인중인 요소가 "Kim"과 같다면
            //// 김서방의 위치를 포함하는 문자열을 반환
            if ("Kim".equals(seoul[i])) {
                
                return "김서방은 " + i + "에 있다";
            }
        }
        
        //여기까지 작성 후 코드 실행하였으나 계속 에러 발생
        //확인결과, 김서방은 항상 존재한다고 하지만 컴파일러는 코드의 가능한 모든 경로를 고려하기 때문에 for문 이후에도 반환문을 추가해야함.
        
        //실제로는 이 부분이 실행될 일은 없음.
        return "김서방이 서울에 없소";
    }
}