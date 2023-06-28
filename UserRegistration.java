import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    
    public static boolean isValidUsername(String username) {
        // Username pattern: Should contain only alphanumeric characters and underscores
        String usernamePattern = "^[a-zA-Z0-9_]+$";
        Pattern pattern = Pattern.compile(usernamePattern);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    
    public static boolean isValidPassword(String password) {
        // Password pattern: Should contain at least 8 characters, including at least one uppercase letter, one lowercase letter, one digit, and one special character
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public static boolean isValidEmail(String email) {
        // Email pattern: Basic email pattern for demonstration purposes
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
        
        System.out.print("Enter an email: ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
        
        scanner.close();
    }
}
