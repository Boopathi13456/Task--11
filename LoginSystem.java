import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctPassword = "Boopathi";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (!enteredPassword.equals(correctPassword)) {
                throw new Exception("Incorrect password. Please enter your valid password");
            } else {
                System.out.println("Login successful");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 Output
 
Enter password: Boopa
Incorrect password. Please enter your valid password

Enter password: Boopathi
Login successful
 */
