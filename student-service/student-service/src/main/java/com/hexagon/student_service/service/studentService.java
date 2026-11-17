package com.hexagon.student_service.service;

import com.hexagon.student_service.dto.school;
import com.hexagon.student_service.dto.studentResponse;
import com.hexagon.student_service.entity.student;
import com.hexagon.student_service.repo.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {
    @Autowired
    private studentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> createStudent(student student){
        try {
            return new ResponseEntity<student>(studentRepository.save(student), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<?> fetchStudentById(String  id) {
        Optional<student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            school school = restTemplate.getForObject("http://SCHOOL-SERVICE/school/" + student.get().getSchoolId(), school.class);
            studentResponse studentResponse = new studentResponse(
student.get().getId(),
                    student.get().getName(),
                    student.get().getAge(),
                    student.get().getGender(),
                    school
            );
            return new ResponseEntity<>(studentResponse,HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Not found",HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<?> fetchstudents(){
        List<student> students=studentRepository.findAll();
        if (students.size()>0){
            return new ResponseEntity<List<student>>(students,HttpStatus.OK);
        }else {
            return new ResponseEntity<>("No Student Found",HttpStatus.NOT_FOUND);
        }
    }
}
