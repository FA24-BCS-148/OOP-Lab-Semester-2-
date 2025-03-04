package utils;

public class PinValidator {
    
    public static class Rules {
        public boolean isValid(String pin) {
            if (pin.length() == 4 && pin.matches("\\d+")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
 	