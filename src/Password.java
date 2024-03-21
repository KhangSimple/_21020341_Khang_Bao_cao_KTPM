import java.util.Scanner;

public class Password {
    public static void main(String[] args) throws Exception {
        int pass_length;
        boolean hasSpecialLetter = false;
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your password:");
        password = scanner.next();
        System.out.println("Here is your password: " + password);
        pass_length = password.length();
        if (password.matches(".*[!@#$%^&*].*")) {
            hasSpecialLetter = true;
        }
        System.out.println("Your password evaluation is " + passwordEvaluation(pass_length, hasSpecialLetter));
    }

    static public String passwordEvaluation(int length, boolean hasSpecialLetter) {
        if (length <= 0) {
            return "ValueError";
        } else if (length < 6) {
            return "Very weak";
        } else if (length < 8) {
            return "Weak";
        } else if (length < 12) {
            if (!hasSpecialLetter) {
                return "Weak";
            } else {
                return "Medium";
            }
        } else if (length <= 16) {
            if (!hasSpecialLetter) {
                return "Medium";
            } else {
                return "Strong";
            }
        } else {
            return "ValueError";
        }
    }
}