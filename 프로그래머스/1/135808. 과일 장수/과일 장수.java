import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        //가격의 총 합 저장
        int answer = 0;
        
        //score배열을 오름차순으로 정렬
        Arrays.sort(score);
        
        //socre배열을 역순으로 순회하면서 점수 계산 진행
        // m을 간격으로 점수를 선택하여 점수 계산
        for(int i=score.length-m; i>=0; i=i-m){
            
            //minScor는 현재 선택된 점수
            int minScore=score[i];
            
            //현재 선택된 점수에 m을 곱하여 해당 점수의 가격을 계산
            int price = minScore * m;
            
            //계산된 가격을 anwer에 더함
            answer=answer+price;
        }
        
        
        return answer;
    }
}