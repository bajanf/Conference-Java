package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {
    private SpeakerRepository repository;

    public List<Speaker> findAll()
    {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
