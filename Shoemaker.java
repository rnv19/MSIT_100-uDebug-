import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


class Days implements Comparable<Days> {
    
    int index;
    double fine;

    Days(int index, double fine) {
        this.index = index;
        this.fine = fine;
    }

    @Override
    public int compareTo(Days days) {
        // TODO Auto-generated method stub
        // double c = days.fine;

        if (this.fine < days.fine) return 1;
        else if (this.fine > days.fine) return -1;
        else return 0;
    }
    
}

/**
 * Shoemaker
 */
public class Shoemaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        while (cases > 0) {
            int input = Integer.parseInt(sc.nextLine());
            double[] sort = new double[input];
            Days[] days = new Days[input];
            int size = 0;
            while (input > 0) {
                String[] str = sc.nextLine().split(" ");
                double a = Integer.parseInt(str[0]);
                double b = Integer.parseInt(str[1]);
                double temp = b / a;
                double fine = Math.round(temp * 100.0) / 100.0;
                days[size] = new Days(size, fine);
                sort[size++] = fine;
                input--;
            }
            Arrays.sort(days);
            for (int i = 0; i < days.length; i++) {
                System.out.print(days[i].index + 1 + " ");
            }
            System.out.println();
            // int count = 0;

            // for (int i = sort.length - 1; i > 0; i--) {
            //     for (Days obj : days) {
            //         if (sort[i] == obj.fine) {
            //             System.out.print(obj.index + 1 + " ");
            //             count++;
            //         }
            //     }
            //     // if (count == sort.length) break;
            // }
            // System.out.println(); 
            cases--;
            if (cases == 0) break;
        }
    }
}