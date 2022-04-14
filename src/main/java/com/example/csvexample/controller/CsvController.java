package com.example.csvexample.controller;

import com.example.csvexample.service.CsvService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CsvController {
    private final CsvService service;


}
