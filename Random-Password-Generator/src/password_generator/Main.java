
package password_generator;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

class Main {
    static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String NUMBERS = "0123456789";
    static final String SPECIAL_CHARACTERS = "!@#$%^&*'\",.<>?";

    static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        String allCharacters = LOWERCASE_CHARACTERS + UPPERCASE_CHARACTERS + NUMBERS + SPECIAL_CHARACTERS;

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random Password Generator...");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the password:");
        int passLength = input.nextInt();

        String generatedPassword = generatePassword(passLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
