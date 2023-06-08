package com.example.api.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ApiService {
    @Autowired
    private ApiRepository apiRepository;
    public List<Comic> getAllDatas() {
        return apiRepository.findAll();
    }
}
