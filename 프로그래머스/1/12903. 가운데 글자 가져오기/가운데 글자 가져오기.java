class Solution {
    public String solution(String s) {
        String answer = "";
        int mean = s.length();
        if(mean % 2 != 0){
            answer = s.substring(mean/2, mean/2+1);
        }else{
            answer = s.substring(mean/2-1, mean/2+1);
        }
        return answer;
    }
}