class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        String evenStr = "";
        String oddStr = "";
        
        for(int i : num_list){
            if(i%2==0)
                evenStr += i;
            else
                oddStr += i;
        }
        
        even += Integer.parseInt(evenStr);
        odd += Integer.parseInt(oddStr);
        return even + odd;
    }
}