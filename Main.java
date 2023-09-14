import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] N_array = new int[scanner.nextInt()];
        int N = 4;
        int[] number = new int[N];

        for (int i = 0; i < N_array.length; i++) {
            N_array[i] = random.nextInt(N);
            number[N_array[i]]++;
        }

        int maxID = 0;
        for (int i = 0; i < N; i++) {
            if (number[i] > number[maxID]) {
                maxID = i;
            }
        }

        System.out.println((number[maxID] > (N_array.length / 2)) ? maxID : -1);
    }
}

