public class Main {
    public static void main(String[] args) {
        //Declare variables
        String firstName = "Angel";
        String lastName = "Jacobs";
        int age = 19;
        double balance = 1500.75;
        boolean accountActive = true;
        int numYearsBank = 3;
        char currency = 'R';

        //Calculations
        double deposited = 300.00;
        double currentBalance = balance + deposited ;
        int futureAge = age + 5;


        //Output
        System.out.println("==========================================");
        System.out.println("                BANK PROFILE              ");
        System.out.println("==========================================");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + currency + balance);
        System.out.println("Account Active: " + accountActive);
        System.out.println("Years With Bank: " + numYearsBank);
        System.out.println("==========================================");

        //Output after deposit
        System.out.println("After depositing " + currency + deposited + ", the current balance is: " + currency + currentBalance);

        //Output of Age after 5 years
        System.out.println(firstName + "'s" + " age in 5 years: " + futureAge);


    }
}
