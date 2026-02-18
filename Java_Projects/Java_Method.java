public class Main {
    //Example of a new methods
    //Declared new method
    static void myMethod1() {
        System.out.println("This is a new method!");
    }

    //Example of new method with parameter inside
    static void myMethod2(String fName) {
        System.out.println(fName + " Jacob");
    }

    //Example of new method with If_Else inside
    static void myMethod3(int age) {
        if (age < 18) {
            System.out.println("Access denied - You're too young");
        }else {
            System.out.println("Access granted - You're old enough");
        }
    }

    //Example of new method with multiple parameters in
    static void myMethod4(String fname, String lname, int age) {
        if ( age >= 18) {
            System.out.println(fname + " " + lname + " is " + age + ", so he's old enough");
        }else {
            System.out.println(fname + " " + lname + " is " + age + ", he's NOT old enough");
        }
    }

    //Example of new method with return value
    static char myMethod5(char currency) {
        return currency;
    }

    //Another example of new method with return value
    static int myMethod6(int totalPrice) {
        return totalPrice + 2349;
    }




    public static void main(String[] args) {
        myMethod1();     //Called the new method
        //Calling the new method multiple times
        myMethod1();
        myMethod1();
        myMethod1();

        System.out.println("\n");

        //Calling second new method with Parameter
        myMethod2("Ntando");
        myMethod2("Mzo");
        myMethod2("Phambi");

        System.out.println("\n");

        //Calling third new method with If...Else inside
        myMethod3(10);
        myMethod3(20);

        System.out.println("\n");

        //Calling forth method with multiple parameters inside
        System.out.println("In order for you to be classified \"OLD ENOUGH\", you need to be over 18 years old. Therefore:");
        myMethod4("Ntando", "Jacob", 11);
        myMethod4("Mzo", "Jacob", 17);
        myMethod4("Phambi", "Jacob", 28);

        System.out.println("\n");

        //Example of new method with return value printed out
        System.out.println("My laptop was " + myMethod5('R') + 11000);

        System.out.println("\n");

        //Another example of new method with return value printed out
        System.out.println("The total price including insurance(" + myMethod5('R') + "2349) is " + myMethod5('R') + myMethod6(11000));

    }
}

