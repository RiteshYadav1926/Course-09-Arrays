import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] trial = getRandomArray(10);
        System.out.println("Array to Arrange in Descending Order = " + Arrays.toString(trial));

        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < trial.length - 1; i++) {
                int n;
                if (trial[i] < trial[i + 1]) {
                    n = trial[i];
                    trial[i] = trial[i + 1];
                    trial[i + 1] = n;
                    check = true;
                }
            }
        }
        System.out.println("Array in Descending Order = " + Arrays.toString(trial));
    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i<len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
