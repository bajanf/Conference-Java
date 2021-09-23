package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
