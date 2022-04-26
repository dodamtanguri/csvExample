package com.example.csvexample.controller;

import com.example.csvexample.DTO.Request.FileUploadRequest;
import com.example.csvexample.service.CsvService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CsvController {
    private final CsvService service;

    @ApiOperation(value = "csv 파일 업로드")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping
    public ResponseEntity fileUpload(@RequestBody final FileUploadRequest req) {

         return ResponseEntity.ok().body(service.fileUpload(req));
    }

}
