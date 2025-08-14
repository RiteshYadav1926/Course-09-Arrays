import java.util.Arrays;
import java.util.Random;

public class HelperClassProperties {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println("...........".repeat(5));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));
        System.out.println("...........".repeat(5));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));
        System.out.println("...........".repeat(5));

        int[] smallerArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallerArray));
        int[] longerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(longerArray));

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
