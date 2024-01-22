package com.micro.event.service;

import com.micro.event.repository.EvenRepository;
import com.micro.event.repository.SubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EvenRepository repository;

    @Autowired
    private SubscriptionRepo reposito;
    @Autowired
    private JavaMailSender javaMailSender;


}
