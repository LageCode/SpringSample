package com.helbjava.springsample.service.impl;

import org.springframework.stereotype.Service;

import com.helbjava.springsample.dto.EmployeeDto;
import com.helbjava.springsample.entity.EmployeeEntity;
import com.helbjava.springsample.mapper.EmployeeMapper;
import com.helbjava.springsample.repository.EmployeeRepository;
import com.helbjava.springsample.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employee = EmployeeMapper.mapToEmployeeEntity(employeeDto);
        EmployeeEntity savedEmployee = this.employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
