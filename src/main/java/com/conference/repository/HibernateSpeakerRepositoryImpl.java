package com.conference.repository;

import com.conference.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hensen");

        speakers.add(speaker);

        return speakers;
    }
}
