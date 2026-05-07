package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TrainController {

    @GetMapping("/")
    public String home() {
        return "Backend Working";
    }

    @PostMapping("/add")
public String addTrain() {
    return "Train Added";
}

}