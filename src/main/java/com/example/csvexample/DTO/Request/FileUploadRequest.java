package com.example.csvexample.DTO.Request;


import lombok.*;

import org.springframework.web.multipart.MultipartFile;
@NoArgsConstructor
@RequiredArgsConstructor
public class FileUploadRequest {
    private MultipartFile excelFile;
}
