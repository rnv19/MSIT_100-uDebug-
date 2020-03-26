import java.util.Arrays;
import java.util.Scanner;

/**
 * Freespots
 */
public class Freespots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String tem = sc.nextLine();
            // System.out.println(tem);
            if (tem.equals("0 0 0")) break;
            String[] str = tem.split(" ");
            int width = Integer.parseInt(str[0]);
            int height = Integer.parseInt(str[1]);
            int N = Integer.parseInt(str[2]);
            int[][] rect = new int[width][height];
            boolean[][] bool = new boolean[width][height];
            int total = width * height;
            while (N > 0) {
                String[] str1 = sc.nextLine().split(" ");
                // System.out.println(Arrays.toString(str1));
                int x1 = Integer.parseInt(str1[0]) - 1;
                int y1 = Integer.parseInt(str1[1]) - 1;
                int x2 = Integer.parseInt(str1[2]) - 1;
                int y2 = Integer.parseInt(str1[3]) - 1;

                if (x1 > x2) {
                    int temp = x1;
                    x1 = x2;
                    x2 = temp;
                } 

                if (y1 > y2) {
                    int temp1 = y1;
                    y1 = y2;
                    y2 = temp1;
                } 
                int count = 0;
                for (int i = x1; i <= x2; i++) {
                    for (int j = y1; j <= y2; j++) {
                        if (bool[i][j] == false) {
                            count++;
                            bool[i][j] = true;
                            total--;
                        }
                    }
                }
                N--;
            }
            if (total == 1) {
                System.out.println("There is one empty spot.");
            } else if (total == 0) {
                System.out.println("There is no empty spots.");
            } else System.out.println("There are " + total + " empty spots.");

            sc.nextLine();
        }
    }
}