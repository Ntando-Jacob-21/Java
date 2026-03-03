package com.example.profile;

public class Profile {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private boolean student;

    public Profile(String firstname, String lastname, int age, String email, boolean student) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.student = student;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isStudent() {
        return student;
    }
}
