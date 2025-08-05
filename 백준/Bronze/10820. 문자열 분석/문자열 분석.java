import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            int lower = 0, upper = 0, number = 0, space = 0;
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) lower++;
                else if (Character.isUpperCase(c)) upper++;
                else if (Character.isDigit(c)) number++;
                else if (c == ' ') space++;
            }
            sb.append(lower).append(' ')
              .append(upper).append(' ')
              .append(number).append(' ')
              .append(space).append('\n');
        }
        System.out.print(sb);
    }
}