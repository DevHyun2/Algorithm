import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> alist = new ArrayList();
        for(int i=start_num ; i<=end_num ; i++){
            alist.add(i);
        }
        answer = alist.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}