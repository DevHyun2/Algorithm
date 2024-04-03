import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 국가의 수
            int M = Integer.parseInt(st.nextToken()); // 비행기 스케줄 수

            // 스케줄 한줄로 연결 받기위함
            Map<Integer, List<Integer>> sd = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                sd.put(i, new ArrayList<>());
            }

            // 비행 스케줄 입력 받기
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sd.get(a).add(b);
                sd.get(b).add(a);
            }

            // 출력
            System.out.println(N - 1);
        }
    }
}