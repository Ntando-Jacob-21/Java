package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org .springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloContoller {

    @GetMapping("/ntando/greeting")
    public String sayHello() {
        return "Hello Ntando!";
    }

//    public Profile() {
//        Profile profile = new Profile ("Ntando", "Jacob", false, "ntando.jacob@gmail.com", 22);
//
//
//        return profile.displayInfo();
//    }
//
//public static void main(String[] args) {
//    SpringApplication.run(HelloContoller.class, args);

}






