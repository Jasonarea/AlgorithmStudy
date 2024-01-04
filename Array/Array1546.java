package Array;

import java.util.Scanner;

public class Array1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum = 0;
        double []scoreArray = new double[N];
        double maxScore = 0;
        for(int i = 0;i<N;i++) {
            scoreArray[i] = in.nextDouble();
            if(maxScore < scoreArray[i])
                maxScore = scoreArray[i];
        }

        for(int i = 0;i<N;i++) {
            scoreArray[i] = scoreArray[i]/maxScore * 100;
            sum += scoreArray[i];
        }
        double result = (sum / N);
        System.out.println(result);
    }
}
