package com.lmsEmployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmsEmployee.dto.EmployeeDto;
import com.lmsEmployee.entity.Employee;
import com.lmsEmployee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	//CREATE
	public Employee addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	//READ
	public List<Employee> getAllEmployees() {
		List<Employee> employee=employeeRepository.findAll();
		return employee;
	}

	//UPDATE
	public Employee getEmployeeById(Long id) {
		Employee employee=employeeRepository.findById(id).get();
		return employee;
	}

	public void updateRegistration(EmployeeDto dto) {
		Employee employee=new Employee();
		employee.setId(dto.getId());
		employee.setName(dto.getName());
		employee.setEmail(dto.getEmail());
		employee.setMobile(dto.getMobile());
		employeeRepository.save(employee);
	}
	
	//DELETE
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);		
	}

}