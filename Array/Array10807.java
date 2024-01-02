package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array10807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0;i<input;i++) {
            int temp = in.nextInt();
            list.add(temp);
        }

        int searchNum = in.nextInt();
        int cnt = 0;

        for(int j = 0;j<input;j++) {
            if(list.get(j) == searchNum) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
