package com.example.profile;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProfileController {

    @GetMapping("/Ntando/profile")
    public Profile getProfile() {
        return new Profile(
                "Ntando",
                "Jacob",
                22,
                "ntando.jacob@gmail.com",
                false
        );
    }
}
