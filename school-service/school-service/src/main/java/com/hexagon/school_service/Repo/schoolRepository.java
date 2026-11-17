package com.hexagon.school_service.Repo;

import com.hexagon.school_service.entity.school;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface schoolRepository extends JpaRepository<school, Long> {
}
