package com.hexagon.school_service.controller;

import com.hexagon.school_service.entity.school;
import com.hexagon.school_service.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value =  "/school")
@RestController
public class schoolController {
    @Autowired
    private schoolService schoolService;

    @PostMapping
    public school addschool(@RequestBody  school school){
return schoolService.addSchool(school);
    }

    @GetMapping
    public List<school> fetchschool(){
        return schoolService.fetchschool();
    }
    @GetMapping("/{id}")
public school fetchschoolbyId(@PathVariable  Long id){
        return schoolService.fetchschoolbyId(id);
    }
}
