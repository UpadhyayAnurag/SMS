package com.project.sms.repository;

import com.project.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "candidates")
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
