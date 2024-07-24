package com.jpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.entities.Coach;
import com.jpa.repositories.CoachRepository;

import java.util.List;

@RestController
@RequestMapping("/coaches")
public class CoachController {

    private final CoachRepository repository;

    public CoachController(CoachRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Coach> getAllCoaches() {
        return repository.findAll();
    }
}
