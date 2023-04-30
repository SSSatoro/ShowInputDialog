import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        int year;
        int now = 2023;
        String txt = "Your age: ";
        try {
            year = Integer.parseInt(showInputDialog(null,
                    "What year you as born?",
                    "Calculating age",
                    QUESTION_MESSAGE));
            int age = now - year;
            txt+=age + " years";
            showMessageDialog(null, txt,"Вік візначений",ERROR_MESSAGE );
        }catch (Exception e){
            showMessageDialog(null,
                    "something went wrong",
                    "maybe and error occured",
                    ERROR_MESSAGE);
        }
    }
}