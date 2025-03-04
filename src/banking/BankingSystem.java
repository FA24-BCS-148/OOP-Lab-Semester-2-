package bank;
import utils.PinValidator;
import java.io.Console;
public class BankingSystem {
    private static final String storedAccountNumber = "001292";
    private static final String storedPin = "1100";
    
    public static class LoginProcessor {
        public boolean authenticate(String accountNo, String pin) {
            String enteredPin = pin;
            Console console = System.console();	
            enteredPin = console.readpassword("Enter the password: ");
            System.out.print("Enter Pin: ");
            
            PinValidator.Rules validation = new PinValidator.Rules();
            if (validation.isValid(enteredPin) && enteredPin.equals(storedPin)) {
                System.out.println("Correct!");
		return true;
            } else {
                System.out.println("Incorrect pin.");
		return false;
            }
        }
    }
}
