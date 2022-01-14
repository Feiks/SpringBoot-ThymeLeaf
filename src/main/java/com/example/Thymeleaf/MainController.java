package com.example.Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class MainController {

    @GetMapping
    String getPeople(Model model ){
        model.addAttribute("something","This is coming from Controller");
        model.addAttribute("people", Arrays.asList(
                new Person("John",20),
                new Person("Jackson",25),
                new Person("Michael",30)));
        return "people";
    }

}
