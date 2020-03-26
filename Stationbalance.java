import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 * Stationbalance
 */
public class Stationbalance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int chambers = Integer.parseInt(str[0]);
        int totalWeight = Integer.parseInt(str[1]);
        String[] st = sc.nextLine().split(" ");
        int[] weights = Arrays.stream(st).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(weights);
        System.out.println(Arrays.toString(weights));


    }
}