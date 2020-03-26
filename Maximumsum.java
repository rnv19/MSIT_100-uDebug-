import java.util.Arrays;
import java.util.Scanner;

/**
 * Maximumsum
 */
public class Maximumsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int cases = Integer.parseInt(sc.nextLine());
            StringBuilder sb = new StringBuilder();
            // int[] temp = new int[cases];
            // int size = 0;
            if (cases == 0) break;
            while (cases-- > 0) {
                int num = Integer.parseInt(sc.nextLine());
                if (num != 0) {
                    // temp[size++] = num;
                    sb.append(num);
                    sb.append(" ");
                }
            }
            if (sb.length() == 0) {
                System.out.println(0);
            } else {
                System.out.println(sb);
            }
        }
    }
}