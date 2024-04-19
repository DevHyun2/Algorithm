import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1 ; i<n+1 ; i++) {
			for(int j=1; j<=i ; j++) {
				if(i*j <= n) sum++;
			}
		}
		System.out.println(sum);
	}
		
}
