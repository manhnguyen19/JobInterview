package com.example.JobInterview.service.classes;

import com.example.JobInterview.entity.Framework;
import com.example.JobInterview.repository.FrameworkRepository;
import com.example.JobInterview.service.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FrameworkService implements IService {
    @Autowired
    FrameworkRepository frameworkRepository;

    @Override
    public Framework create(Framework framework) {
        return frameworkRepository.save(framework);
    }

    @Override
    public List<Object> read() {
        return null;
    }
}
