package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Service("speakerService")
public class SpeakerServiceImp implements SpeakerService {
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }


    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImp setter");
        this.repository = repository;
    }
    @Autowired
    public SpeakerServiceImp(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImp repository constructor");
        repository=speakerRepository;
    }

    public SpeakerServiceImp(){
        System.out.println("SpeakerServiceImp no args constructor");
    }
}
