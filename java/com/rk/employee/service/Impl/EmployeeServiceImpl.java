package com.rk.employee.service.Impl;

import org.springframework.stereotype.Service;

import com.rk.employee.dto.EmployeeDto;
import com.rk.employee.entity.Employee;
import com.rk.employee.mapper.EmployeeMapper;
import com.rk.employee.repository.EmployeeRepository;
import com.rk.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee=EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee=employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
		
	}

}
