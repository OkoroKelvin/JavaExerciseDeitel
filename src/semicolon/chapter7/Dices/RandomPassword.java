package semicolon.chapter7.Dices;

import java.security.SecureRandom;

public class RandomPassword {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomPassword;
        String passwordSet = "ABCDEFGHIJKLMNOPQuartz1234567890!@#$%^&*()_+|}{:>?<";
        char[] password = new char[6];



        for (int i = 0; i <= 5; i++) {
            randomPassword = 1 + random.nextInt(51);
            password[i] = passwordSet.charAt(randomPassword);
        }
        System.out.println(password);

    }
}
