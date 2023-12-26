package com.app.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/word")
public class Controller {
    @Autowired
    WordRepository repo;
    private final Service service;

    @Autowired
    public Controller(Service service){
        this.service = service;
    }

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public Word getRandomWord(){
        return service.getRandomWord();
    }
}
