import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] dice;
    static int N; //주사위 개수
    static int[] opposite = {5, 3, 4, 1, 2, 0}; // 주사위 반대방향 index
    static int[] max; // 각 주사위별 최댓값 저장
    static int result = 0; // 전체 경우의 수에 대한 최댓값 저장
 
    public static void main(String[] args) throws IOException {
    	StringTokenizer st;
    	N = Integer.parseInt(br.readLine());
    	dice = new int[N][6]; // 주사위 입력
    	max = new int[N]; 
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for (int j = 0; j < 6; j++) {
    			dice[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	for (int i = 0; i < 6; i++) { // 첫 주사위는 마음대로 놓을 수 있기 때문에 6가지 면 모두 테스트
    		Arrays.fill(max, 0); //max 배열을 0으로 초기화[0, 0, 0, 0, 0]
    		dfs(i, 0);
    	}
    	
    	System.out.println(result);
    }
    
    public static void dfs(int bottom, int cnt) { // bottom: 현재 주사위 아랫쪽 면, cnt: 현재 쌓은 주사위 갯수
        int top = opposite[bottom]; // top: 현재 주사위 윗쪽 면
        int next_bottom = -1; // 다음 주사위의 아랫쪽 면
 
        for (int i = 0; i < 6; i++) {
            if (i == bottom || i == top) { // 현재 주사위의 아랫쪽 면과 윗쪽 면을 제외하고,
                continue;
            }
 
            max[cnt] = Math.max(max[cnt], dice[cnt][i]); // 가장 큰 수를 max 배열에 저장 (n번째 주사위의 측면 최댓값을 n번 인덱스에 저장)
        }
 
        
        if (cnt == N - 1) { // 마지막 주사위까지 다 쌓았으면,
            int sum = 0;
            for (int i = 0; i < N; i++) { // 현재 max 배열에 있는 모든 수를 더해준다. (각 주사위 별 측면 최댓값을 모두 더해준 것.)
                sum += max[i];
            }
            result = Math.max(result, sum); // 전체 최댓값 갱신
            return;
        }
 
        for (int i = 0; i < 6; i++) { // 다음 쌓을 주사위의 아랫면을 찾아서
        	if (dice[cnt][top] == dice[cnt + 1][i]) {
        		next_bottom = i;
        	}
        }

        dfs(next_bottom, cnt + 1); // 재귀함수를 통해 다음 주사위를 쌓아준다.
    }
 
}

