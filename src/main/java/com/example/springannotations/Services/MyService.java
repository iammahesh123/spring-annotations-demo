package com.example.springannotations.Services;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello() {
        return "My Service";
    }
}
