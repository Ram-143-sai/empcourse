package com.example.demo.controller;
import java.util.List;

import com.example.demo.service.EmployeeService;
import com.example.demo.model.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
    	
	@RequestMapping("/admin/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/admin/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/admin/addEmployee")
	public void employeeSave(@RequestBody Employee empmodel) {
		employeeService.addEmployee(empmodel);
		
	}
	@RequestMapping(method = RequestMethod.POST,value="/admin/employeeEdit/{id}")
	public void employeeEditSave(@RequestBody Employee productmodel,@PathVariable String id ) {
		employeeService.updateEmployee(productmodel,id);
	}
	
	@RequestMapping(method= RequestMethod.DELETE,value="/admin/empdelete/{id}")
	public void productDelete(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}
    
}

