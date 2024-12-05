package com.lmsEmployee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.lmsEmployee.dto.EmployeeDto;
import com.lmsEmployee.entity.Employee;
import com.lmsEmployee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired 
	private EmployeeService employeeService;
	
	//HOME
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "create_registration";
	}

	//CREATE
	@RequestMapping("/addEmployee")
	public String addEmp(@ModelAttribute Employee employee,Model model) {
		employeeService.addEmployee(employee);
		model.addAttribute("msg","Record is saved");
		return "create_registration";
	}
	
	//READ
	@RequestMapping("/getAllEmployees")
	public String getAllEmp(Model model) {
		List<Employee> employee=employeeService.getAllEmployees();
		System.out.println(employee);
		model.addAttribute("employee",employee);
		return "list_employees";
	}
	
	//UPDATE
	@RequestMapping("/updateEmp")
	public String updateEmp(@RequestParam Long id,Model model) {
		Employee employee=employeeService.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "update_employees";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateReg(EmployeeDto dto,Model model) {
		employeeService.updateRegistration(dto);
		List<Employee> employee=employeeService.getAllEmployees();
		System.out.println(employee);
		model.addAttribute("employee",employee);
		model.addAttribute("msg","Record is updated");
		return "list_employees";
	}
		
	//DELETE
	@RequestMapping("/deleteEmp")
	public String deleteEmp(@RequestParam long id,Model model) {
		employeeService.deleteEmployee(id);		
		List<Employee> employee=employeeService.getAllEmployees();
		model.addAttribute("employee",employee);
		model.addAttribute("msg","Record is deleted");
		return "list_employees";
	}
}