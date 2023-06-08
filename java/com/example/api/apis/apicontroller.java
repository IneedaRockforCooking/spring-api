package com.example.api.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/datas")
public class ApiController {
    @Autowired
    private ApiService apiService;
    @GetMapping
    public ResponseEntity<List<Api>> allDatas() {
        return new ResponseEntity<List<Api>>(apiService.getAllDatas(),HttpStatus.OK);
    }
}
