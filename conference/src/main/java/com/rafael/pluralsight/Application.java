package com.rafael.pluralsight;

import com.rafael.pluralsight.service.SpeakerService;
import com.rafael.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }

}
