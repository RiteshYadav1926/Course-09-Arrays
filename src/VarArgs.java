public class VarArgs {
    public static void main(String[] args) {

        String[] splitText = "My Hello to the World".split(" ");
        printText(splitText);

        System.out.println("....".repeat(20));
        printText("Hello");

        System.out.println("....".repeat(20));
        printText("My","Hello","to","the","World");

        System.out.println("....".repeat(20));
        printText();
    }
    public static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
    }
}
