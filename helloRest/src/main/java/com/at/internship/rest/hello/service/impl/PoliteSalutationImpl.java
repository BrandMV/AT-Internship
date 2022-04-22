package com.at.internship.rest.hello.service.impl;

import com.at.internship.rest.hello.service.IPoliteSalutation;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class PoliteSalutationImpl implements IPoliteSalutation {
    @Override
    public String getPoliteSalutation() {
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.of(12,0)))
            return "Good morning";
        if(now.isBefore(LocalTime.of(19,0)))
            return "Good Afternoon";
        return "Good Night";
    }
}
