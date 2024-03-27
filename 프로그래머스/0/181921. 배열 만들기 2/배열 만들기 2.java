import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> alist = new ArrayList<>();

		for (int i = l; i <= r; i ++) {
            boolean bool = true;
			for (char ch : String.valueOf(i).toCharArray()) {
				if (ch != '0' && ch != '5') {
                    bool = false;
					continue; // 0,5가 아니면 다음숫자 넘어가기
				}
			}
            if(bool){alist.add(i);}// 0,5 숫자들만 리스트에 추가
		}
		if (alist.isEmpty()) {
			alist.add(-1);
		}
		int[] result = new int[alist.size()];
		for(int k=0 ; k<alist.size() ; k++) {
			result[k] = alist.get(k);
		}
		return result;

    }
}