public class Main {
    public static void main(String[] args) {
        //Example of switch statement
        int today = 8;
        switch (today) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day Not Found!");
        }


        //Another example
        //Vending machine:
        //Num1: Coffee; Num2: Tea; Num3: Colddrink; Num4: Juice; Num5: Milkshake
        //Coffee - R30; Tea- R25; Colddring - R20; Juice - R22; Milkshake - R15;
        //The customer wants to buy Colddrink and wants to know the price.

        int beverages = 3;

        switch (beverages) {
            case 1:
                System.out.println("You've selected: Coffee.");
                break;
            case 2:
                System.out.println("You've selected: Tea");
                break;
            case 3:
                System.out.println("You've selected: Colddrink");
                break;
            case 4:
                System.out.println("You've selected: Juice");
                break;
            case 5:
                System.out.println("You've selected: Milkshake");
                break;
            default:
                System.out.println("Please select a number between 1 and 5");

        }

        //Declare prices of the beverages
        int coffeePrice = 30;
        int teaPrice = 25;
        int colddrinkPrice = 20;
        int juicePrice = 22;
        int milkshakePrice = 15;

        char currency = 'R';

        if (beverages == 1) {
            System.out.println("Price: " + currency + coffeePrice);
        }else if (beverages == 2) {
            System.out.println("Price: " + currency + teaPrice);
        }else if (beverages == 3) {
            System.out.println("Price: " + currency + colddrinkPrice);
        }else if (beverages == 4) {
            System.out.println("Price: " + currency + juicePrice);
        }else {
            System.out.println("Price: " + currency + milkshakePrice);
        }

        //Conclusion statement
        System.out.println("Enjoy!");
    }
}
