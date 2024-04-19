import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentsu = sc.nextInt();//학생수
		int number[] = new int[studentsu];//번호표
		List<Integer> studentList = new ArrayList<Integer>();
		
		for(int i=0 ; i<studentsu ; i++) {
			number[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<studentsu ; i++) {
			studentList.add(number[i], i+1);
		}
		for(int i=studentsu-1 ; i>=0 ; i--) {
			System.out.print(studentList.get(i)+" ");
		}
	}

}
