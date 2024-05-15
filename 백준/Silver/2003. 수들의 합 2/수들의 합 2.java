import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int sumMax = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //코드시작
        int start = 0; // 부분 수열의 시작 인덱스
        int end = 0; // 부분 수열의 끝 인덱스
        int sum = 0; // 부분 수열의 합
        int count = 0; // 합이 M이 되는 부분 수열의 개수

        while (true) {
            // 현재 부분 수열의 합이 M보다 작거나 같으면 end를 늘려나감
            if (sum <= sumMax) {
                if (end == N) break; // end가 수열의 끝에 도달하면 종료
                sum += arr[end++];
            } else { // 현재 부분 수열의 합이 M보다 크면 start를 늘려나감
                sum -= arr[start++];
            }

            // 현재 부분 수열의 합이 M이면 count를 증가
            if (sum == sumMax) count++;
        }

        System.out.println(count);
	}
}
