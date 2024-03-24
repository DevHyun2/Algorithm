class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        //i는 1부터 시작 : 배열의 index번호 1번부터가 코드 출력시작
        for(int i=1 ; i<numLog.length ; i++){
            int dif = numLog[i] - numLog[i-1];
            if(dif == 1) {
                answer += "w";
            }else if(dif == -1){
                answer += "s";
            }else if(dif == 10){
                answer += "d";
            }else if(dif == -10){
                answer += "a";
            }
        }
        return answer;
    }
}