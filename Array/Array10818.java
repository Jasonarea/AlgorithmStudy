package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        List<Integer> list = new ArrayList<>();


        for(int i = 0 ; i< input; i++) {
            int temp = in.nextInt();
            list.add(temp);
        }

        int max = list.get(0);
        int min = list.get(0);
        for(int i = 1;i<input;i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }

            if(list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println(min + " " + max);
    }
    
}
