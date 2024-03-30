import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else {
                while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                    stk.remove(stk.size() - 1);
                }
                stk.add(arr[i]);
            }
        }
        
        return stk;
    }
}