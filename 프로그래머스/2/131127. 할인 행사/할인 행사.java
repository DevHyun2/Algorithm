import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 정현이가 원하는 제품과 수량을 HashMap에 저장
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        // 슬라이딩 윈도우 방식으로 10일씩 확인
        for (int i = 0; i <= discount.length - 10; i++) {
            // 10일간의 할인 제품을 카운트할 HashMap
            HashMap<String, Integer> discountMap = new HashMap<>();
            
            // 현재 10일간의 할인된 제품들을 카운트
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            
            // 정현이가 원하는 제품과 수량이 모두 일치하는지 확인
            boolean canRegister = true;
            for (String product : want) {
                if (!discountMap.containsKey(product) || discountMap.get(product) < wantMap.get(product)) {
                    canRegister = false;
                    break;
                }
            }
            
            if (canRegister) {
                answer++;
            }
        }
        
        return answer;
    }
}