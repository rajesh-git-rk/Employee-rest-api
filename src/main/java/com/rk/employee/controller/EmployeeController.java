package com.rk.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rk.employee.dto.EmployeeDto;
import com.rk.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String home(){
        return "Hello World!";
    }
	
	//Build Add Employee REST API
	
	//@PostMapping("api/employees")
	@RequestMapping(value = "api/employees", method = RequestMethod.POST)
	public ResponseEntity<EmployeeDto>CreateEmployee(@RequestBody EmployeeDto employeeDto){
		
		System.out.println("employee entry.............");
		EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
		
		return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
		
	}
	
	

}
