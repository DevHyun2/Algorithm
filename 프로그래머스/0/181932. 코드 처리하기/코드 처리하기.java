class Solution {
	public String solution(String code) {
        StringBuilder answer = new StringBuilder();
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);
			if (mode == 0) {
				if (ch != '1') {
					if (i % 2 == 0) {
						answer.append(ch);
					}
				} else {
					mode = 1;
				}
			} else {
				if (ch != '1') {
					if (i % 2 != 0) {
						answer.append(ch);
					} 
				}else {
						mode = 0;
					}
			}

		}
		return answer.length() == 0 ? "EMPTY" : answer.toString();
	}
}
