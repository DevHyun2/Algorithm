class Solution {
    public int solution(String s) {
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0 ; i<numString.length ; i++){
            if(s.contains(numString[i])){
                s = s.replace(numString[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }
}