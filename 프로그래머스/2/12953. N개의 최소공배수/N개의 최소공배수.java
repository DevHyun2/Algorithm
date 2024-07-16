class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 1) return arr[0];
        
        int gcdNum = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1])/gcdNum;
        
        if(arr.length>2){
            for(int i=2 ; i<arr.length ; i++){
                gcdNum = gcd(answer, arr[i]);
                answer = (answer * arr[i])/gcdNum;
            }
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int r = a%b;
        if(r == 0) return b;
        return gcd(b, r);
    }
}