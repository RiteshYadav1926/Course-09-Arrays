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

        System.out.println("....".repeat(20));
        String[] sArray = {"first", "second", "third","fourth", "fifth"};
        System.out.println(String.join("," , sArray));
    }
    public static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
    }
}
