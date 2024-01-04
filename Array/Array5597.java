package Array;

import java.util.Scanner;

public class Array5597 {
    public static void main(String[] args) {
        boolean []hwSubmitYn = new boolean[31];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<28;i++) {
            int studentNum = in.nextInt();
            hwSubmitYn[studentNum] = true;
        }

        for(int i = 1;i<=30;i++) {
            if(!hwSubmitYn[i])
                System.out.println(i);
        }
    }
}
