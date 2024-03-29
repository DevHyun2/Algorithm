import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
	private static Integer x; //x 정의
	private static Integer y; //y 정의

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키보드로 입력 받기
		int N = sc.nextInt(); //점의 개수
		List<List<Integer>> unknown = new ArrayList<>();//x, y가 한쌍이 되도록

		for (int i = 0; i < N; i++) {
			x = sc.nextInt();//x값 받기
			y = sc.nextInt();//y값 받기
			
			List<Integer> point = new ArrayList<Integer>();
			point.add(x);
			point.add(y);
			unknown.add(point);//x, y를 한쌍으로 만들어서 unknown List에 담기
		}
		//y asc, x asc
		Collections.sort(unknown, new Comparator<List<Integer>>() {

			public int compare(List<Integer> p1, List<Integer> p2) {
				int y1 = p1.get(1);
				int y2 = p2.get(1);
				if(y1 != y2) {
					return y1 -y2;
				}else {
					int x1 = p1.get(0);
					int x2 = p2.get(0);
					return x1 - x2;
					
				}
				
			}
		});
		//결과 출력
		for(List<Integer> point : unknown) {
			System.out.println(point.get(0) + " " + point.get(1));
		}
	};

}
