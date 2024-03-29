import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// 키보드로 입력받기
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[][] chessBoard = new boolean[N][M];

		int count = 64; // 보드를 칠해야 하는 최대 갯수 8x8

		// 배열 입력받기
		for (int i = 0; i < N; i++) {
			String color = sc.next();
			for (int j = 0; j < M; j++) {
				// charAt : String 문자열중에서 한글자만 char타입으로 변환
				if (color.charAt(j) == 'W') {
					chessBoard[i][j] = true; // W는 true
				} else {
					chessBoard[i][j] = false; // B는 false
				}
			}
		}
		// https://blog.itcode.dev/posts/2021/06/26/a1018 - 경우의 수
		// 탐색 코드
		for (int i = 0; i < N - 7; i++) { // 세로의 경우의 수
			for (int j = 0; j < M - 7; j++) { // 가로의 경우의 수
				//Math.min을 통해 최솟값 교체
				count = Math.min(count, reCount(chessBoard, i, j));
			}
		}
		System.out.println(count);
		sc.close();
	}
	//reCount : i,j 번째에서 다시 8x8 돌기(시작이 W, B 구분)
	private static int reCount(boolean[][] chessBoard, int x, int y) {
		int reCountW = 0; //시작이 W
		int reCountB = 0; //시작이 B
		
		//시작이 W인 경우
		for(int i=x ; i<x+8 ; i++) {
			for(int j=y ; j<y+8 ; j++) {
				//i+j가 짝수 : [홀수 열 - 짝수 행]or[짝수 열 - 홍수 행]
				if((i+j)%2 == 0) {
					if(chessBoard[i][j]) reCountW++; 
				}else{
					if(!chessBoard[i][j]) reCountW++;
				}
			}
		}
		//시작이 B인 경우
				for(int i=x ; i<x+8 ; i++) {
					for(int j=y ; j<y+8 ; j++) {
						//i+j가 짝수 : [홀수 열 - 짝수 행]or[짝수 열 - 홍수 행]
						if((i+j)%2 == 0) {
							if(!chessBoard[i][j]) reCountB++; 
						}else{
							if(chessBoard[i][j]) reCountB++;
						}
					}
				}
		//모든 경우의 수중 최소 return		
		return Math.min(reCountW,reCountB);
	}
}