import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	 public static int w, h, count;
	    public static boolean[][] land;
	    public static boolean[][] visited;
	    static int[] xMove = {0, 0, -1, 1, 1, 1, -1, -1};
	    static int[] yMove = {-1, 1, 0, 0, 1, -1, 1, -1};

	    public static void main(String[] args) throws Exception {
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        while (true) {
	            String[] split = br.readLine().split(" ");
	            w = Integer.parseInt(split[0]);
	            h = Integer.parseInt(split[1]);
	            if (w == 0) break;

	            visited = new boolean[h][w];
	            land = new boolean[h][w];
	            count = 0;
	            for (int i = 0; i < h; i++) {
	                String[] split1 = br.readLine().split(" ");
	                for (int j = 0; j < w; j++) {
	                    int num = Integer.parseInt(split1[j]);
	                    if (num == 1) {
	                        land[i][j] = true;
	                    } else land[i][j] = false;
	                }
	            }

	            for (int i = 0; i < h; i++) {
	                for (int j = 0; j < w; j++) {
	                    // 땅이며 아직 방문하지 않은 땅이면 탐색 시작
	                    if (land[i][j] && !visited[i][j]) {
	                        dfs(i, j);
	                        count++;
	                    }
	                }
	            }


	            bw.write(count + "\n");
	        }

	        bw.flush();
	        bw.close();
	        br.close();
	    }

	    private static void dfs(int x, int y) {
	        // 방문 처리
	        visited[x][y] = true;

	        // 나의 상하좌우 대각선 다 살피기
	        for (int i = 0; i < 8; i++) {
	            int newX = x + xMove[i];
	            int newY = y + yMove[i];
	            // 주어진 칸 안에 있는 곳 일때
	            if (newX >= 0 && newX < h) {
	                if (newY >= 0 && newY < w) {
	                    // 탐색하는 칸이 땅이며 아직 방문하지 않은 곳이라면
	                    if (land[newX][newY] && !visited[newX][newY]) {
	                        dfs(newX, newY);
	                    }
	                }
	            }
	        }
	    }
	}