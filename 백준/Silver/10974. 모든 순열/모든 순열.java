import java.util.Scanner;

class Main {
	static int N;
	static int[] permutation;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		permutation = new int[N+1];
		
		check = new boolean[N+1];
		
		getPermutation(1);
	}

	private static void getPermutation(int depth) {
		if(depth == N+1) {
			getPrintAnswer();
			return;
		}
		for(int i=1; i<=N ; i++) {
			if(!check[i]) {
				check[i] = true;
				permutation[depth] = i;
				getPermutation(depth + 1);
				check[i] = false;
			}
		}
	}

	private static void getPrintAnswer() {
		for(int i=1; i<=N ; i++) {
			System.out.print(permutation[i]+ " ");
		}
		System.out.println();
	}

}