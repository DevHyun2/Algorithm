import java.util.*;
class Solution {
    public List<Integer> solution(int n, int m) {
        List<Integer> answer = new ArrayList<Integer>();
        int gcd = 0; //최대공약수
        int lcm = 0; //최소공배수
        
        // 최대공약수 구하기
        for(int i = 1; i <= Math.min(n, m); i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        
        // 최소공배수 구하기
        lcm = (n * m) / gcd;
        
        // 결과 추가
        answer.add(gcd);
        answer.add(lcm);
        
        return answer;
    }
}
