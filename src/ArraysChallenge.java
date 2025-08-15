import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] trial = getRandomArray(10);
        System.out.println("Array to Arrange in Descending Order = " + Arrays.toString(trial));

        Arrays.sort(trial);

        int[] descending = new int[trial.length];
        for (int i = 0; i < trial.length; i++){
            int n = trial.length;
            descending[i] = trial[n-1-i];
        }
        System.out.println("Array in Descending Order = " + Arrays.toString(descending));

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
