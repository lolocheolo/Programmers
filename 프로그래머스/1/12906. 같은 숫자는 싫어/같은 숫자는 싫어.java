import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        //임시로 중복값 저장할 ArrayList 생성
        //Integer 타입을 저장할 수 있는 ArrayList인 arrList 생성
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        //1. 초기 비교값 설정(arr의 범위 0~9)
        //int num=10;
        
        //2. arr에 음수 또는 10이상의 수가 포함된다면 에러 발생하므로 다음과              같이 개선
        if(arr.length>0){
            int num=arr[0];
            arrList.add(num); 
        
        
        // arr배열을 순차 확인, 각 요소가 num가 다른경우 arrList에 추가
        // 동시에 num을 현재 요소의 값으로 업데이트하면서 반복 요소 제거
        for(int i=0; i<arr.length; i++){
            if(arr[i] != num) {
                arrList.add(arr[i]);
                num=arr[i];
            }
          }
        }
        
        //결과 배열 초기화(arrList의 크기만큼)
        answer = new int[arrList.size()];
        
        //arrList의 모든 요소를 answer로 복사...
        for(int i=0; i<answer.length; i++){
            answer[i]=arrList.get(i);
        }
        
        return answer;
    }
}