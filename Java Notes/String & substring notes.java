public class Main {
    public static void main(String[] args) {
        String myString = "!@#$%^&*()_=+{}\\|,;<,>.?/";

        System.out.println(myString);

        System.out.println(myString.length());

        System.out.println(myString.charAt(8));

        //I want the system to output the backlash
        System.out.println(myString.charAt(myString.length() - 10));

        //Testing printout statements with indexOf()
        String myName = "Ntando Jacob";
        System.out.println("The number of characters including the space between name and surname (Ntando Jacob) is: " + myName.length()); //Output: 12
        System.out.println("Which position is the \"d\" in Ntando Jacob?\n Answer: " + myName.indexOf("d")); //Output 4

        System.out.println(" ");

        System.out.println("NB!! When you want to know the number of characters a string has (.length()),\n the system starts counting from 1, but when you want to find the position (.index()) or a certain character\n(.charAt()), then the system starts counting from 0 and adds an extra layer at the end.");


        //Testing from Udemy exercise about substring:
        String udemyString = "Hello World!";
        System.out.println("The answer of your udemy testing is: "
                + udemyString.substring(3, 8));

        //Testing .trim() method
        String txt1 = "Hello \"World!\"";
        System.out.print(txt1);



    }
}
