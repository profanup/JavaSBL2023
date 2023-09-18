/* Write Java Program where user will enter loginid and password as input. 
The password should be 8 digit containing one digit and one special symbol. 
If user enter valid password satisfying above criteria then show 
“Login Validation Successful Message”. If user enter invalid Password then 
create InvalidPasswordException stating Please enter valid
password of length 8 containing one digit and one Special Symbol
*/

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter login ID: ");
        String loginId = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Login Successful!");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() != 8) {
            throw new InvalidPasswordException("InvalidPasswordException: Please enter a valid password of length 8 containing one digit and one special symbol.");
        }

        boolean hasDigit = false;
        boolean hasSpecialSymbol = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialSymbol(ch)) {
                hasSpecialSymbol = true;
            }
        }

        if (!hasDigit || !hasSpecialSymbol) {
            throw new InvalidPasswordException("InvalidPasswordException: Please enter a valid password of length 8 containing one digit and one special symbol.");
        }
    }

    private static boolean isSpecialSymbol(char ch) {
        String specialSymbols = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
        return specialSymbols.contains(String.valueOf(ch));
    }
}

