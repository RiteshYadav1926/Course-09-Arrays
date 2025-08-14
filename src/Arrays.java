public class Arrays {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[5] = 10;

        double[] myDoubleArray = new double[6];
        myDoubleArray[3] = 9.578;

        System.out.println(myIntArray[0]);
        System.out.println(myDoubleArray[3]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First Element of Array = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Array Length = " + arrayLength);
        System.out.println("Last Element = " + firstTen[arrayLength-1]);

        System.out.println("--".repeat(20));

        int[] newArray;
//        newArray = new int[]{5,4,3,2,1,0};
        newArray = new int[6];
        for (int i =0; i < newArray.length;i++){
            newArray[i] = newArray.length - i;
        }
        for (int i=0; i < newArray.length; i++){
            System.out.println("Element at Index " + i+ " is =" + newArray[i]);
        }
    }
}
