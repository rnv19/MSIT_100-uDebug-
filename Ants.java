import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ants
 */
public class Ants{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = Integer.parseInt(sc.nextLine());

        while (cases-- > 0) {
            // String[] str = sc.nextLine().split(" ");
            int poleLength = sc.nextInt();
            sc.nextLine();
            String[] str = sc.nextLine().split(" ");
            // System.out.println(Arrays.toString(str));
            // int[] min = new int[noOfAnts];
            List<Integer> min = new ArrayList<>();
            for (String s : str) {
                int temp = Integer.parseInt(s);
                int temp1 = temp - 0;
                int temp2 = poleLength - temp;
                if (temp1 <= temp2) {
                    // min[size++] = temp1;
                    min.add(temp1);
                } else {
                    // min[size++] = temp2;
                    min.add(temp2);
                } 
            }
            // System.out.println(Arrays.toString(min));
            Collections.sort(min);
            // System.out.println(min.toString());
            System.out.print(min.get(min.size() - 1) + " ");
            System.out.print(poleLength -  min.get(0));
            System.out.println();
        }
    }
    
}
