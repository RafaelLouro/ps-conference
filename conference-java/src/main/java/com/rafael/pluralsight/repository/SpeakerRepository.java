package com.rafael.pluralsight.repository;

import com.rafael.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
