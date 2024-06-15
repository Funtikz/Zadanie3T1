package org.example.zadanie3.controller;

import lombok.AllArgsConstructor;
import org.example.zadanie3.service.BaseTo64Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ExampleController {

    private final BaseTo64Service baseTo64Service;

    @GetMapping("api/convert-to-base64")
    public ResponseEntity<String> convertToBase64(@RequestParam String email, @RequestParam String code) {
        String result = baseTo64Service.convertToBase64(email, code);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
