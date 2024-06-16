class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str_ab = Integer.toString(a)+Integer.toString(b);
        String str_ba = Integer.toString(b)+Integer.toString(a);
        
        int num_ab = Integer.parseInt(str_ab);
        int num_ba = Integer.parseInt(str_ba);
        
        answer += num_ab>num_ba?num_ab:num_ba;
        return answer;
    }
}