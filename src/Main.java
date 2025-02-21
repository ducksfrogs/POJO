//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "John";
                case 3 -> "Jack";
                case 4 -> "Jane";
                case 5 -> "Smith";
                default -> null;
                    },
                    "12/05/1988",
                    "Java MasterClass");
            System.out.println(s);
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}