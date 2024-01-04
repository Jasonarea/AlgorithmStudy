package Array;

import java.util.Scanner;

public class Array10811 {
    public static void main(String[] args) {
        int N, M;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        int []baskets = new int[N + 1];
        for(int i = 1;i<= N;i++) {
            baskets[i] = i;
        }

        for(int cnt = 0; cnt < M; cnt++) {
            int i = in.nextInt();
            int j = in.nextInt();

            for(int cg = 0;cg < (j-i+1)/2;cg++) {
                int temp = baskets[i + cg];
                baskets[i + cg] = baskets[j - cg];
                baskets[j - cg] = temp;
            }
        }

        for(int i = 1;i<=N;i++) {
            System.out.print(baskets[i] + " ");
        }

    }
}
