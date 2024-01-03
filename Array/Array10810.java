package Array;

import java.util.Scanner;

public class Array10810 {
    public static void main(String[] args) {
        //바구니 N개
        // 바구니에는 번호가 매겨져있어
        //  1~N까지 번호가 적혀있는 공을 많이 가져
        // 가장 처음바구니에는 공 X
        // 바구니에는 공을 1개만 넣을 수 있어.
        // 도현이는 M번 공을 넣으려고해
        // 1. 공을 넣을 바구니 범위를 정한다.
        // 2. 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
        // 3. 만약 바구니에 공이 이미 있는 경우 들어있는 공을 빼고 새로 공을 넣는다.
        // 4. 공을 넣을 바구니는 연속되어 있어야해.

        // 공을 어떻게 넣을지가 주어졌을때 M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int []basket = new int[N];
        int i, j, k;
        for(int co = 0; co < M; co++) {
            i = in.nextInt();
            j = in.nextInt();
            k = in.nextInt();

            for(int cnt = i - 1; cnt < j; cnt++) {
                basket[cnt] = k;
            }
        }

        for(int co = 0; co < N; co ++) {
            System.out.print(basket[co] + " ");
        }
    }
}
