package com.rafael.pluralsight.service;

import com.rafael.pluralsight.model.Speaker;
import com.rafael.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.rafael.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
