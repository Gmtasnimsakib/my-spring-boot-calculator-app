package com.numericcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Creating Controller
@RestController
public class CalculateController {

    //Creating 5 API:

    //1.Home
    @GetMapping("/home")
    public String home(){
        return "Hello Arfin Bhai!! This is your personal Calculator.";
    }

    //2.Add (using query parameter)
    @GetMapping("/add")
    public int add(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1 + num2;
    }

    //3.Add (using query parameter)
    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1 - num2;
    }

    //4.Add (using query parameter)
    @GetMapping("/mul")
    public int mul(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1 * num2;
    }

    //5.Add (using query parameter)
    @GetMapping("/div")
    public double div(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return (double) num1 / num2;
    }
}
