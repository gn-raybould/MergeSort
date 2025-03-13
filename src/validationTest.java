import java.util.Scanner;

public class validationTest {
    public static void main(String[] args) throws Exception {
        boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;
        boolean specialChar = false;
        Scanner passwordScanner;
        passwordScanner = new Scanner(System.in);
        System.out.print("Please choose a password you would like to validate: ");
        String password = passwordScanner.nextLine();
        if ((password.length() >=8) && (password.length() <= 16)){
            if (checkLowercase(password) == true) {
                lowercase = true;  
            }
            if(checkUppercase(password) == true){
                uppercase = true;
            }
            if (number(password) == true){
                number = true;
            }
            if(specialChar(password) == true){
                specialChar = true;
            }
            if ((lowercase && uppercase && number) || (lowercase && uppercase && specialChar)
               || (lowercase && number && specialChar) || (uppercase && number && specialChar)
               || (lowercase && uppercase && number && specialChar)){
                System.out.println("Congrats! Your password passed at least 3 of the tests. Secure password.");
            }
            else{
                System.out.println("Test Failed. Please restart the program to test again.");
            }
        }
        passwordScanner.close();
    }
    private static boolean checkLowercase(String str) {
        char ch;
        boolean lowerCase = false;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCase = true;
            }
            if(lowerCase == true)
                return true;
        }
        return false;
    }
    private static boolean checkUppercase(String str) {
        char ch;
        boolean upperCase = false;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase = true;
            }
            if(upperCase == true)
                return true;
        }
        return false;
    }
    private static boolean number(String str) {
        char ch;
        boolean number = false;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                number = true;
            }
            if(number == true)
                return true;
        }
        return false;
    }
    private static boolean specialChar(String str) {
        boolean specialChar = false;
        for(int i=0;i < str.length();i++) {
            if (str.contains("~") || str.contains("!") || str.contains("@") || 
            str.contains("$") || str.contains("%") || str.contains("^") || str.contains("&") 
            || str.contains("*") || str.contains("(") || str.contains(")") || str.contains("_")
            || str.contains("-") || str.contains("=") || str.contains("+")) {
                specialChar = true;
            }
            if(specialChar == true)
                return true;
        }
        return false;
    }

    
}