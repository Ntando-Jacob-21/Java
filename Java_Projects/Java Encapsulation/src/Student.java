public class Student {
//    Declared variables for the student
    private String name;
    private String surname;
    private int age;
    private String email;

//    Constructor for the student
    Student(String name, String surname, int age) {
//        Changed the construct because we're changing variable values
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }

//    Get methods declared here.
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

//    Add a Set method for different student's information.
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
