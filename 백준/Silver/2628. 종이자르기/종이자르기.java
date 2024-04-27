import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken()); // 가로
        int h = Integer.parseInt(st.nextToken()); // 높이

        List<Integer> wlist = new ArrayList<Integer>();
        List<Integer> hlist = new ArrayList<Integer>();

        wlist.add(0); //가로 처음
        wlist.add(w); //가로 끝
        hlist.add(0); //세로 처음
        hlist.add(h); //세로 끝
        
        int cutCnt = Integer.parseInt(br.readLine()); // 자르는 횟수


        for (int i = 0; i < cutCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(st.nextToken()); // 자르는 방향
            int cutNum = Integer.parseInt(st.nextToken()); // 자르는 위치

            if (choice == 0) {
                Cut(hlist, cutNum); // 가로로 자르기 (세로 길이 변경)
            } else {
                Cut(wlist, cutNum); // 세로로 자르기 (가로 길이 변경)
            }
        }

        // 가장 큰 사각형의 넓이 계산
        System.out.println(findMax(wlist)*findMax(hlist));
    }

    // 리스트에서 자르기
    public static void Cut(List<Integer> list, int cutNum) {
        for (int i = 0; i < list.size(); i++) {
            if (cutNum < list.get(i)) {
                list.add(i, cutNum);
                break;
            }
        }
    }
    //wlist의 경우[0, 4, 10]
    //hlist의 경우[0, 2, 3, 8]
    
    
    // 리스트에서 최대값 찾기
    public static int findMax(List<Integer> list) {
        int max = 0;
        
        for (int i = 1; i < list.size(); i++) {
            int size = list.get(i) - list.get(i - 1);
            if (size > max) {
                max = size;
            }
        }
        return max;
    }
    //wlist : 4-0 = 4, 10-4 = 6 => max = 6
    //hlist : 2-0 = 2, 3-2 = 1, 8-3 = 5 => max = 5
}