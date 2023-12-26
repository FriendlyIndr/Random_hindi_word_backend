package com.app.backend;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final WordRepository wordRepository;
    @Autowired
    public Service(WordRepository wordRepository){
        this.wordRepository = wordRepository;
    }

    public Word getRandomWord(){
        List<Word> words = wordRepository.findAll();
        if(!words.isEmpty()){
            long leftLimit = 0L;
            long rightLimit = (wordRepository.findAll().size());
            long randomId = leftLimit +  (long) ( Math.random() * (rightLimit - leftLimit));
            return wordRepository.getReferenceById(randomId);
        }
        return null;
    }

}
