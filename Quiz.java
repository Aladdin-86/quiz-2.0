import javax.swing.JOptionPane;

public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;

    static String ask(String question) {
        String answer = JOptionPane.showInputDialog(question);
        if (answer == null || answer.trim().equals("")) {
            return ask(question);
        }
        answer = answer.toUpperCase();
        if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
            return answer;
        }
        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
        return ask(question);
    }

    static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, the correct answer is " + correctAnswer);
        }
    }

    public static void main(String[] args) {
        check("How many months have 31 days in them?\nA- 10\nB- 8\nC- 6\nD- 7\nE- 5", "D");
        check("What is the oldest city in the world?\nA- Cairo\nB- Jeruselem\nC- Rome\nD- Damascus\nE- Jordan", "D");
        check("Where was the first music note found?\nA- Andorra\nB- Madina\nC- Egypt\nD- Iraq\nE- Ugarit", "D");

        JOptionPane.showMessageDialog(null, "You got " + nCorrect + " out of " + nQuestions + " questions correct.");
    }
}
