public class VarArgs {
    public static void main(String[] args) {

        String[] splitText = "My Hello to the World".split(" ");
        printText(splitText);

    }
    public static void printText(String[] textList){
        for (String t : textList){
            System.out.println(t);
        }
    }
}
