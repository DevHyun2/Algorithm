package own;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_2605_권대현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentsu = sc.nextInt();//학생수 5
		int number[] = new int[studentsu];//번호표 0 1 1 3 2
		List<Integer> studentList = new ArrayList<Integer>();
		
		for(int i=0 ; i<studentsu ; i++) {
			number[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<studentsu ; i++) {
			studentList.add(number[i], i+1); //1 3 5 2 4
		}
		/* 출력 순서
		 * 1 - 1
		 * 2 - 1 2
		 * 3 - 1 3 2
		 * 4 - 1 3 2 4
		 * 5 - 1 3 5 2 4 
		 */
		//역순으로 출력
		for(int i=studentsu-1 ; i>=0 ; i--) { //학생 번호표에 맞게 출력하기
			System.out.print(studentList.get(i)+" ");
		}
	}

}
