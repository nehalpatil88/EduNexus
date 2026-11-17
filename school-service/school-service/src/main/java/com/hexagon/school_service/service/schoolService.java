package com.hexagon.school_service.service;

import com.hexagon.school_service.Repo.schoolRepository;
import com.hexagon.school_service.entity.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class schoolService {
    @Autowired
    private schoolRepository schoolRepository;

    public school addSchool(school school) {
        return schoolRepository.save(school);
    }

    public List<school> fetchschool() {
        return schoolRepository.findAll();
    }

    public school fetchschoolbyId(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }
}
