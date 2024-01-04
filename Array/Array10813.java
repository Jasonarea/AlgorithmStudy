package Array;

import java.util.Scanner;

public class Array10813 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;
        N = in.nextInt();
        M = in.nextInt();
        int []baskets = new int[N + 1];
        for(int i = 1;i<=N;i++) {
            baskets[i] = i;
        }

        for(int i = 0;i < M; i++) {
            int changeBall1, changeBall2;
            changeBall1 = in.nextInt();
            changeBall2 = in.nextInt();
            int temp = baskets[changeBall1];
            baskets[changeBall1] = baskets[changeBall2];
            baskets[changeBall2] = temp;
        }

        for(int i = 1;i<=N;i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
