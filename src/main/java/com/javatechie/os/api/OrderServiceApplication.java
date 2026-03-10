package com.javatechie.os.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Github Action !";
    }

   /* echo "# GitHubActions" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/SureshAshok/GitHubActions.git
    git push -u origin main*/

    public static void main(String[] args) {

        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
