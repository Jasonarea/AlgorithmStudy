package loop;

import java.util.Scanner;

public class Loop25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        num /= 4;
        for(int i = 0;i<num;i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
