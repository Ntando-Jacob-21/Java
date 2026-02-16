public class Main {
    public static void main(String[] args) {
        //First basic "if" statement
        String projectCreated = "16 Feb 2026";
        if (projectCreated.equals("16 Feb 2026")) {
            System.out.println("It was on a Monday");
        }


        //Second basic "if...else" statement
        int num1 = 30;
        if (num1 < 25) {
            System.out.println("successful");
        } else {
            System.out.println("failed");
        }


        //You can also run an "if" statement that's one line without curly braces ({})
        int num2 = 13;
        if (num2 > 10) {
            System.out.println("13 is bigger than 10 so this statement will printout");
        }

        //Basic else if statement
        int weather = 25; //10 = cold;  15 = ok; 25 = hot
        if (weather == 10) {
            System.out.println("It's cold!");
        } else if (weather == 15) {
            System.out.println("It's OK!");
        }else {
            System.out.println("It's hot!");
        }


        //Basic example of ternery if...else statement
        String todayWeather = (weather == 10) ? "It's cold!" : "Its's hot!";
        System.out.println(todayWeather + " to walk.");


        //Example of ternery operator used directly in printout statement
        int time = 20;
        System.out.println((time < 18)? "Good day." : "Good Evening.");


        //Example of nested ternery
        int newTime = 20;
        String message = (newTime == 22)? "Time for bed"
                        :(newTime == 21)? "Dinner time."
                        :"Watch tv";
        System.out.println(message);


        //Example of Nested if statement
        int x = 10;
        int y = 20;
        if (x == 10) {
            System.out.println("Tha's correct");
            if (y == 20) {
                System.out.println("This is also correct");
            }
        }


        //Example of if...else statement with logical operators
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityNum = 3;
        if (isLoggedIn && (isAdmin || securityNum == 2)) {
            System.out.println("Access Granted");
        }else {
            System.out.println("Access Denied");
        }


        //If Else coding challenge
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Movie Ticket System          ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Variables created
        String movieName = "The Avengers: End Game";
        int age = 16;
        boolean isStudent = true;
        double ticketPrice;

        //Pricing Rule
        if (age <= 12) {
            ticketPrice = 50;
        }else if (age <= 17) {
            ticketPrice = 70;
        }else if (age <= 59) {
            ticketPrice = 100;
        }else {
            ticketPrice = 60;
        }

        //Student Discount
        double discount;
        if (isStudent && (age < 25)) {
            discount = ticketPrice * 0.10;
            ticketPrice -= discount;
        }

        //Output
        System.out.println("Age: " + age);
        System.out.println("Student status: " + isStudent);
        System.out.println("Final Ticket Price: R" + ticketPrice);

        System.out.println("Movie: " + movieName);
        System.out.println("Enjoy the movie!");
        





    }
}
