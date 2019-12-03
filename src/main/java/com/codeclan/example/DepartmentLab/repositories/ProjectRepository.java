package com.codeclan.example.DepartmentLab.repositories;

import com.codeclan.example.DepartmentLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
