import java.util.Random;

public class HelperClassProperties {
    public static void main(String[] args) {

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
