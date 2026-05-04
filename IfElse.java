public class IfElse {

    public static void main(String[] args) {

        int age = 20;
        double balance = 150.75;
        boolean isAccountActive = true;
        char accountType = 'P';

        if (isAccountActive) {

            if (age >= 18) {

                if (balance > 100) {
                    System.out.println("Access granted: Adult with sufficient balance.");
                } else {
                    System.out.println("Access limited: Balance too low.");
                }

            } else {
                System.out.println("Access denied: Underage.");
            }

        } else {
            System.out.println("Account is inactive.");
        }
        if (accountType == 'P') {
            System.out.println("Personal account.");
        } else if (accountType == 'B') {
            System.out.println("Business account.");
        } else {
            System.out.println("Unknown account type.");
        }
    }
}
