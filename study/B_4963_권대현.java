package own;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class B_4963_권대현 {

	 public static int w, h, count;
	    public static boolean[][] land; //입력값이 땅인지 구별하는 boolean배열
	    public static boolean[][] visited; //입력값을 방문하는지 구별하는 boolean배열
	    static int[] xMove = {0, 0, -1, 1, -1, 1, -1, 1}; // 상 하 좌 우 좌상, 우상, 좌하, 우하
	    static int[] yMove = {-1, 1, 0, 0, -1, -1 , 1, 1}; // 상 하 좌 우 좌상, 우상, 좌하, 우하

	    public static void main(String[] args) throws Exception {
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        while (true) {
	            String[] split = br.readLine().split(" "); //공백을 기준으로 분리된 문자열 입력받기
	            w = Integer.parseInt(split[0]);
	            h = Integer.parseInt(split[1]); //첫 번째 열 입력받기
	            if (w == 0) break; //첫 번째 입력값이 0이면 while문 종료

	            visited = new boolean[h][w];
	            land = new boolean[h][w]; //입력 받은 w, h 로 배열 생성
	            count = 0; //땅을 찾을 때 count
	            for (int i = 0; i < h; i++) {
	                String[] split1 = br.readLine().split(" ");
	                for (int j = 0; j < w; j++) {
	                    int num = Integer.parseInt(split1[j]);
	                    if (num == 1) {
	                        land[i][j] = true;
	                    } else land[i][j] = false; //땅인지 아닌지 구별
	                }
	            }

	            for (int i = 0; i < h; i++) {
	                for (int j = 0; j < w; j++) {
	                    // 땅이면서 아직 방문하지 않은 땅이면 탐색 시작
	                    if (land[i][j] && !visited[i][j]) { //땅들을 순회하며 이어져있는지 확인
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
	        visited[x][y] = true; //중복해서 방문하는 것 방지

	        // 나의 상하좌우 대각선 다 살피기
	        for (int i = 0; i < 8; i++) { //상, 하, 좌, 우 대각선 까지 탐색
	            int newX = x + xMove[i];
	            int newY = y + yMove[i];
	            // 주어진 칸 안에 있는 곳 일때
	            if (newX >= 0 && newX < h) { 
	                 if (newY >= 0 && newY < w) { //새로운 좌표가 배열 범위 안인지 체크
	                    // 탐색하는 칸이 땅이며 아직 방문하지 않은 곳이라면
	                    if (land[newX][newY] && !visited[newX][newY]) {
	                        dfs(newX, newY);//재귀함수 : 해당좌표로 주변 땅 탐색
	                    }
	                }
	            }
	        }
	    }
	}