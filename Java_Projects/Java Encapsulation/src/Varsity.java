public class Varsity {
    public static void main(String[] args) {

//        Object to call the student from the Student class
        Student student = new Student("Ntando", "Jacob", 22);

//        New values added with setter
        student.setName("Uzair");
        student.setSurname("Ahmod");
        student.setAge(19);

//        Display the current student
        System.out.println("Student name: " + student.getName());
        System.out.println("Student surname: " + student.getSurname());
        System.out.println("Student age " + student.getAge());

        System.out.println("\n");
        System.out.println("Is the student 20 or older?");
//        If statement weather the student is over 20
        if (student.getAge() >= 20) {
            System.out.println("Student is over the mid age and can get VIP student number.");
        }else {
            System.out.println("Student is not 20 years or older.");
        }
    }
}
