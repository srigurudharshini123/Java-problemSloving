// Create a custom exception InvalidAgeException.
// Throw the exception if age is less than 18 while registering a user.
public class Main {
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            System.out.println(message);
        }
    }
    static void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Registration Successful");
    }
    public static void main(String[] args) {

        try {
            register(16);
        } 
        catch (InvalidAgeException e) {

        }
    }
}
