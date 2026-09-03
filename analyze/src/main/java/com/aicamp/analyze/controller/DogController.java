package com.aicamp.analyze.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aicamp.analyze.dto.DogCatResponse;
import com.aicamp.analyze.service.DogApiService;

@RestController
public class DogController {

    private final DogApiService dogApiService;

    DogController(DogApiService dogApiService) {
        this.dogApiService = dogApiService;
    }

    @PostMapping("/predict")
    public DogCatResponse predict(@RequestParam MultipartFile file) {

        return dogApiService.sendImage(file);

    }
}
