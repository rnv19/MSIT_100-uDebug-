import java.io.*;
import java.util.*;
class Table implements Comparable<Table>{
    int id;
    int capacity;
    Table(int i, int c) {
        id = i;
        capacity = c;
    }

    public int compareTo(Table that){
        if(this.capacity < that.capacity)
            return 1;
        else if (this.capacity > that.capacity)
            return -1;
        else
            return 0;
    }
}

class Team {
    int id;
    int capacity;

    Team(int i, int c) {
        id = i;
        capacity = c;
    }
}

public class Thegranddinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int teams = sc.nextInt();
            int tables = sc.nextInt();
            if (teams == 0 && tables == 0)
                break;
            if (teams > tables) {
                System.out.println("0");
                break;
            }
            Team[] t = new Team[teams];
            Table[] ta = new Table[tables];
            for(int i = 0; i < teams; i++) {
                Team t1 = new Team(i + 1, sc.nextInt());
                t[i] = t1;
            }
            
            for(int i = 0; i < tables; i++) {
                Table t1 = new Table(i + 1, sc.nextInt());
                ta[i] = t1;
            }
            
            Arrays.sort(ta);
            String[] res = new String[teams];
            boolean flag = true;
            for(int i = 0; i < teams; i++) {
                if (flag == false)
                    break;
                String st = "";
                for(int j = 0; j < t[i].capacity; j++) {
                    if (ta[j].capacity == 0){
                        System.out.println("0");
                        flag = false;
                        break;
                    }
                    st = st + ta[j].id + " ";
                    ta[j].capacity -= 1;
                }
                res[i] = st;
                Arrays.sort(ta);
            }
            if (flag == false)
                continue;
            System.out.println("1");
            for(int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
            
        }
    }
}