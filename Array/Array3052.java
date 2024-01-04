package Array;

import java.util.Scanner;

public class Array3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean []booleanArray = new boolean[42];

        for(int i = 0;i<10;i++) {
            int temp = in.nextInt();
            temp %= 42;
            booleanArray[temp] = true;
        }

        int cnt = 0;
        for(int i = 0;i<42;i++) {
            if(booleanArray[i]) cnt++;
        }

        System.out.println(cnt);
    }
}
