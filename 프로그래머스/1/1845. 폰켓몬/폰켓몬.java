import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
// nums 배열의 반의 길이 값을 num에 저장, nums 배열의 길이는 항상 짝수
        int num = nums.length / 2;
        
// 중복을 허용하지 않는 Set 컬렉션을 생성. Integer 타입의 요소를 담는 HashSet 인스턴스를 생성하여 arr에 할당
        Set<Integer> arr = new HashSet<>();
        
// nums 배열의 모든 요소를 순회하면서 Set인 arr에 추가. 이 과정에서 중복된 요소는 제거
        for (int n : nums) {
            arr.add(n);
        }
//------------------------------------------------------------        
//set에 들어간 개수보다 배열길이의 반이 클 경우 set들어간 개수 반환
//       if( arr.size() < num){
//           return arr.size();
//       }
//        return num;
//------------------------------------------------------------      
        
        //삼항 연산자 적용
        return arr.size() < num ? arr.size() : num;
    }
}