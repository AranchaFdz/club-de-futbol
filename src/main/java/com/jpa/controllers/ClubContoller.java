package com.jpa.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entities.Club;
import com.jpa.repositories.ClubRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(path="/clubs")
public class ClubContoller {

    private ClubRepository repository;
    
    public ClubContoller(ClubRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Club> getAllClubs() {
        return repository.findAll();
    }
}
