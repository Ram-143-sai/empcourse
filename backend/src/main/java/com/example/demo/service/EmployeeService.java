package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employeeModels = new ArrayList<>();
		employeeRepository.findAll().forEach(employeeModels::add);
		return employeeModels;
		
	}
	
	public Employee getEmployee(String id) {
		//return topics.stream().filter(t->t.getTopicId().equals(id)).findFirst().get();
		return employeeRepository.findById(id).filter(t->t.getEmpId().equals(id)).get();
	}

	public void addEmployee(Employee emp) {
		//topics.add(topic);
		employeeRepository.save(emp);
	}

	public void updateEmployee(Employee emp, String id) {
		employeeRepository.save(emp);
	}

	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}
