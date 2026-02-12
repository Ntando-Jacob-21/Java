public class Main {
    public static void main(String[] args) {
        // (&&) And operator
        System.out.println("5 == 5 && 4 == 4: " + (5 == 5 && 4 == 4));   //Output: true
        System.out.println("5 == 5 && 4 ==3: " + (5 == 5 && 4 == 3));   //Output: false
        System.out.println("5 == 3 && 4 ==3: " + (5 == 3 && 4 == 3));   //Output: false

        // (||) OR operator
        System.out.println("5 == 5 || 4 == 4: " + (5 == 5 || 4==4)); //Output: true
        System.out.println("5 == 5 || 4 == 3: " + (5 == 5 || 4==3)); //Output: true
        System.out.println("5 == 4 || 4 ==3: " + (5 == 4 || 4 == 3)); //Output: false

        // (!) NOT operator
        System.out.println("!(5 == 5): " + !(5 == 4));     //Output: true
        System.out.println("5 != 5: " + (5 != 5));     //Output: false

        //Code testing
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        int itemPrice = 20;
        int shippingPrice = 10;

        int sum = itemPrice + shippingPrice;
        System.out.println("Total amount: " + sum);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Alphabet has " + alphabet.length() + " characters.");
        System.out.println("The letter 'V' is positioned number " + alphabet.indexOf("V") + " in the alphabet");

        System.out.println("- Remember whenever you using 'indexOf' method, don't forget to add the double quotations in the parenthesis.");
        System.out.println("AN EXAMPLE of indexOf:");
        System.out.println("To find the position of a letter on an alphabet: Goal is to find positon of the letter 'L' = indexOf(\"L\")");

        //The difference between ".equals()" and "=="
        String txt1 = "Hello";
        String txt2 = "Hello";

        System.out.println(txt1 == txt2);
        System.out.println(txt1.equals(txt2));


        String firstName= "Ntando";
        String lastName= "Jacob";

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + " " + lastName);

        // String data type notes:
        System.out.println("You can concatenate two strings by \"+=\" as a different method");
        System.out.println("For Example: ");
        System.out.println("Code: String hello = \"Hello \";\n      hello += \"World\"; //Output = Hello World");
        String hello = "Hello ";
         hello += "World";
        System.out.println(hello);

    }
}
