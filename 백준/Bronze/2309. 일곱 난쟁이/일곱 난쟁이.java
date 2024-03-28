import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	//난쟁이 키 입력 받기
        Scanner sc = new Scanner(System.in);

        List<Integer> talls = new ArrayList<>();
        int sum = 0;//아홉 난쟁이 키 합계 받기위함
        for (int i = 0; i < 9; i++) {
            int tall = sc.nextInt();//숫자 입력받아 tall에 저장
            talls.add(tall);
            sum += tall;
        }

        // sum이 100이 되는 일곱 난쟁이를 찾기
        Loop://**라벨
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - talls.get(i) - talls.get(j) == 100) {
                	talls.remove(j);
                	talls.remove(i); // j를 먼저 제거하므로 i의 인덱스가 하나 감소함
                    break Loop;//**난쟁이 찾으면 빠지기
                }
            }
        }

        talls.sort(Comparator.naturalOrder()); // 오름차순 정렬
        for (int tall : talls) {
            System.out.println(tall);
        }
        sc.close();
    }
}