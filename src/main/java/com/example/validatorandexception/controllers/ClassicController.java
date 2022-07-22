package com.example.validatorandexception.controllers;

import com.example.validatorandexception.dtos.BuddyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ClassicController {

@PostMapping ("/")
    public ResponseEntity <Object> postSomething (@RequestBody @Valid BuddyDTO dude){
    return ResponseEntity.status(HttpStatus.OK).body(dude);
}

}
