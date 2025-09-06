import java.util.Arrays;

public class NestedArrays {
    public static void main(String[] args) {

        int[][] array1 = new int[4][4];
        System.out.println(Arrays.toString(array1));
        System.out.println("Length of Array = " + array1.length);

        for (int[] outer: array1){
            System.out.println(Arrays.toString(outer));
        }
    }
}
