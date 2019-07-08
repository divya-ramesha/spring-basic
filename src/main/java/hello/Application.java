package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Application {

//    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//        System.out.println("Hello World!!");
//        LocalTime currentTime = new LocalTime();
//        System.out.println("The current local time is: " + currentTime);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}