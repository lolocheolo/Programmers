class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        //삼중반복문 활용하여 3개씩 순차적으로 더해서 0값 찾기
        //[1,2,3,4,5,6,7,8]==> 123,124,125,126~
        for(int i=0; i<number.length; i++){
            for( int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}