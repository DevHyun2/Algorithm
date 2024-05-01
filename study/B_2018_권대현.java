package own;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class B_2018_권대현 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 1<= N <= 1000만 입력받기
		int cnt = 0;// 조건에 부합하는 수 count

		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for(int j=i ; j<=N ; j++) { //i가 +1 되면 그 수 부터 15까지
				sum += j;
				if (sum == N) {
					cnt++;
					break;
				} else if (sum > N) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
