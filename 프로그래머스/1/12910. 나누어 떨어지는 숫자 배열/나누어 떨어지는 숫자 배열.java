import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        // arr에서 divisor로 나누어 떨어지는 값 개수 저장(count)
        // divisor로 나누어 떨어지는 요소 값 저장(number)
        int count=0;
        int number=0;
        
        //배열arr의 값들이 divisor로 나누어 떨어지는지 확인
        //나누어 떨어진다면 count 값++
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor==0){
                count++;
            }
        }
        
        //만약 divisor로 나누어떨어지는 변수가 없다면
        // -1을 가지는 배열 반환
        if(count==0){
            int[] answer={-1};
            return answer;
        }
        
        //count값 크기의 배열 생성
        int[] answer= new int[count];
        
        //다시 배열arr의 값들이 divisor로 나누어 떨어지는지 확인
        //떨어지는 값들을 배열answer에 추가하고, number증가시키면서 배열에 추가
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor== 0){
                answer[number]=arr[i];
                number++;
            }
        }
        
        //answer에 저장된 값 정렬 후 반환
        Arrays.sort(answer);
        return answer;
        
    }
}