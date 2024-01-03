package Array;

import java.util.Scanner;

public class Array2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []intArray = new int[9];
        int max = 0, sequence = 0;
        for(int i = 0;i<9;i++) {
            intArray[i] = in.nextInt();
            if(intArray[i] > max) {
                max = intArray[i];
                sequence = i + 1;
            }
        }
        System.out.println(max + "\n" + sequence);
    }
}
