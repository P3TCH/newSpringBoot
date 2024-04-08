package com.example.learning.controller;

import com.example.learning.service.Factorial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {

    private Factorial factorial;

    @GetMapping("factorial")
    public @ResponseBody String calFactorial(@RequestParam int number){
        factorial = new Factorial();
        return "Factorial is " + factorial.getFactorial(number);
    }
}
