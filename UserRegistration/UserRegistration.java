package UserRegistration;

import java.util.Scanner;

public class UserRegistration {
	
    private static Scanner scan = new Scanner(System.in);

    public static void main(String arg[])
    {
        ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();
        System.out.println("Enetr your gamil");
        String gamil = scan.next();

        validationUserEntry.emailValidation(gamil);

    }
}

