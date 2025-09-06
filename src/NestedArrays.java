import java.util.Arrays;

public class NestedArrays {
    public static void main(String[] args) {

        int[][] array1 = new int[4][4];
        System.out.println(Arrays.toString(array1));
        System.out.println("Length of Array = " + array1.length);

        for (int[] outer: array1){
            System.out.println(Arrays.toString(outer));
        }
        System.out.println(".................................................");

        for (int i = 0;i< array1.length;i++){
            var innerArray = array1;
            for (int j = 0;j<array1.length;j++){
                array1[i][j] = (i*10)+(j*1);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
//        for (var Outer: array1){
//            for (var Elements: Outer){
//                System.out.print(Elements + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array1));
    }
}
