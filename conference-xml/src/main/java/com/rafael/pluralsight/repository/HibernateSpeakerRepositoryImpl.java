package com.rafael.pluralsight.repository;

import com.rafael.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker();
        speaker.setFirstName("Rafael");
        speaker.setLastName("Louro");

        List<Speaker> speakers = new ArrayList<>();
        speakers.add(speaker);

        return speakers;
    }

}
