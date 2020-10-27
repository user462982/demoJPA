package com.example.demo.services;

import com.example.demo.entities.SubProperty;
import com.example.demo.repositories.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    final Repository repository;

    public MyService(Repository repository) {
        this.repository = repository;
    }

    public void myServiceMethod(){
        repository.findAllBySubProperty(new SubProperty());
    }

}
