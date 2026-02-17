public class Main {
    public static void main(String[] args) {
        //Example of a while loop (counting 0 - 10)
        System.out.println("1) Count from 0 to 10 using while loop:");
        int count1 = 0;
        while (count1 < 11) {
            System.out.println(count1);
            count1++;
        }
        System.out.println("Count finished!");

        System.out.println("\n");

        //Example of while loop (counting 10 - 0)
        System.out.println("2) Coutdown from 10 to 0 using while loop backwards:");
        int count2 = 10;
        while (count2 > -1) {
            System.out.println(count2);
            count2--;
        }
        System.out.println("Count finished! \n");

        //Example of do/while
        System.out.println("3) Count from 20 to 30 using do/while loop:");
        int count3 = 20;
        do {
            System.out.println(count3);
            count3++;
        } while (count3 < 31);
        System.out.println("Count finished! \n");

        //Example of do/while loop when condition is false
        System.out.println("This is the output of do/while loop if the condition is false:");
        int count4 = 31;
        do {
            System.out.println("\"Loop executed at least once:\" " + count4);
            count4++;
        } while (count4 < 31); //False condition


        //Example of for loop
        System.out.println("\n4) Count from 31 to 40 using For loop:");
        for (int count5 = 31; count5 <= 40; count5++) {
            System.out.println(count5);
        }
        System.out.println("Count finished!");

        //Another example of for loop in this case printing even numbers
        System.out.println("\n5) Printing out even numbers from 2 to 20 using for loop:");
        for (int count6 = 2; count6 <= 20; count6 += 2) {
            System.out.println(count6);
        }
        System.out.println("Count finished!\n");

        //Example of Nested Loop- A loop inside a loop
        System.out.println("6) This is an example of nested for loop:");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }

        }

        //Another example of Nested for loop
        //Making 3 lists of 2 items each
        System.out.println("\n7) Another example of Nested for loop:");

        for (int list = 1; list <=3; list++) {
            System.out.println("List " + list + ":");

            for (int item = 1; item <=2; item++) {
                System.out.println("\t Item " + item);
            }
        }


        System.out.println("\n");


        //Exercise on For and While Loop
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("          Daily Fitness Tracker           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //For loop declared for days completed workout
        System.out.println("PART 1 - FOR LOOP");
        for (int workoutDays = 1; workoutDays <= 7; workoutDays++) {
            System.out.println("Day " + workoutDays + ":" + " Workout completed");
        }

        //While loop declared number of pushups
        System.out.println("\nPART 2 - WHILE LOOP");
        int pushUps = 10;
        while (pushUps <= 30) {
            System.out.println("Push-ups done: " + pushUps);
            pushUps += 5;
        }

        //Conclusion
        System.out.println("Workout goal reached! Great job!");


    }
}
