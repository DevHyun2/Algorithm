import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> alist = new ArrayList<>();
        alist.add(n);
        
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            alist.add(n);
        }
        
        return alist;
    }
}