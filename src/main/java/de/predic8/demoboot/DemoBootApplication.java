package de.predic8.demoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoBootApplication {

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        SpringApplication.run(DemoBootApplication.class, args);
    }

}
