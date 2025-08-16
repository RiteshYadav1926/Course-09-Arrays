import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        readIntegers();

    }
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all the Elements of Array separated with Comma's - ");
        String elements = scanner.nextLine();

        String[] myArray = elements.split(",");
        int[] array = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            array[i] = Integer.parseInt(myArray[i].trim());
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
