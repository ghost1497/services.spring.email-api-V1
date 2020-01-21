package com.elemental.emailapi.controller;

import com.elemental.emailapi.dto.ContactFormDto;
import com.elemental.emailapi.service.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class EmailNotificationController {


    @Autowired
    private EmailNotificationService notificationService;

    @PostMapping(value = "/contactform" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContactFormDto> sendContactFormNotification(@RequestBody ContactFormDto contactFormDto){
        return notificationService.sendContactFormNotification(contactFormDto);
    }
}