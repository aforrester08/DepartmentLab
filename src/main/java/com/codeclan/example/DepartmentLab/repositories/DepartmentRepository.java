package com.codeclan.example.DepartmentLab.repositories;

import com.codeclan.example.DepartmentLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
