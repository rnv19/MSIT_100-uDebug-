import java.util.Scanner;

/**
 * Coincollector
 */
public class Coincollector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        while (cases > 0) {
            int coinTypes = Integer.parseInt(sc.nextLine());
            int[] coins = new int[coinTypes];
            int size = 0;
            String[] str = sc.nextLine().split(" ");
            for (String st : str) {
                coins[size++] = Integer.parseInt(st);
            }
            // while (coinTypes > 0) {
            //     int i = sc.nextInt();
            //     coins[size++] = i;
            //     coinTypes--;
            // } sc.nextLine();

            int temp = coins[0];
            int count = 1;
            for (int i = 1; i < coins.length; i++) {

                if (i == coins.length) {
                    // count++;
                    break;
                }
                // temp += coins[i];
                System.out.println(temp + " " + coins[i]);
                if (temp < coins[i]) {
                    temp += coins[i];
                    System.out.println("temp :" + temp);
                    count++;
                }else {
                    temp -= coins[i - 1];
                    temp += coins[i];
                }
                System.out.println("count :" + count);
            }
            System.out.println(count);
            cases--;
        }
    }
}
