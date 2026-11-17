package com.hexagon.student_service.repo;

import com.hexagon.student_service.entity.student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends MongoRepository<student,String> {
}
