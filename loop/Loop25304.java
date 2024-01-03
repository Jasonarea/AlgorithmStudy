package loop;

import java.util.Scanner;

public class Loop25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalPrice = in.nextInt();
        int productNum = in.nextInt();

        int price, num;
        int sum = 0;
        for(int i = 0;i<productNum;i++ ) {
            price = in.nextInt();
            num = in.nextInt();

            sum += price * num;
        }

        if(sum == totalPrice) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
