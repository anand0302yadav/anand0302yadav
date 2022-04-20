package com.example.demo.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class TestController {

	@Autowired
	Employee emp;
	
	public TestController() {
		System.out.println("test controller");
	}
	
	@GetMapping("/empoyee1")
	public Employee getEmployee1() {
		emp.setName("Anand");
		emp.setEmpId(549916);
		return emp;
	}
	
	@GetMapping("/empoyee2")
	public Employee getEmployee2() {
		//emp.setName("changedName");
		return new Employee();
	}
}
