import java.util.Scanner;

/**
 * Scarecrow
 */
public class Scarecrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = Integer.parseInt(sc.nextLine());
        int c = 0;
        while (cases-- > 0) {
            c++;
            int n = Integer.parseInt(sc.nextLine());

            String[] str = sc.nextLine().split("");
            
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                if (str[i].equals(".")) {
                    count++;
                    i += 2;
                } else {
                    continue;
                }
            }

            System.out.println("Case " + c + ": " + count);
        }
    }
}