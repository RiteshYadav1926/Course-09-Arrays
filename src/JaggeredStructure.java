import java.util.Arrays;

public class JaggeredStructure {
    public static void main(String[] args) {

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[0] = new String[]{"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1","2"},
                {"11","12","13"},
                {"21","22","23","24"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        
    }
}
