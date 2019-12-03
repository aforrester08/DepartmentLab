package com.codeclan.example.DepartmentLab;

import com.codeclan.example.DepartmentLab.models.Department;
import com.codeclan.example.DepartmentLab.models.Employee;
import com.codeclan.example.DepartmentLab.models.Project;
import com.codeclan.example.DepartmentLab.repositories.DepartmentRepository;
import com.codeclan.example.DepartmentLab.repositories.EmployeeRepository;
//import com.codeclan.example.DepartmentLab.repositories.ProjectRepository;
import com.codeclan.example.DepartmentLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepartmentLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployees(){
		Department department = new Department("Sales");
		Employee employee1 = new Employee("Susan", "Smith", 12345, department);
		Employee employee2 = new Employee("John", "Black", 12346, department);
		Project project = new Project("Synergy", 7);
		departmentRepository.save(department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		projectRepository.save(project);
//		department.addEmployee(employee1);
//		department.addEmployee(employee2);
//		departmentRepository.save(department);
		project.addEmployee(employee1);
		project.addEmployee(employee2);
		projectRepository.save(project);

	}

}
