package com.example.springrestapp.controllers;

import com.example.springrestapp.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryControllers {

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c =  Country.of("France", 67);
        return  ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Paris")
                .header("favorite_food", "cheese and wine")
                .header("something", "4")
                .body(c);
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country armenia = Country.of("Armenia", 3);
        Country france = Country.of("France",67);

        return List.of(armenia,france);
    }
}
