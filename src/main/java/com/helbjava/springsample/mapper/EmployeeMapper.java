package com.helbjava.springsample.mapper;

import com.helbjava.springsample.dto.EmployeeDto;
import com.helbjava.springsample.entity.EmployeeEntity;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(EmployeeEntity employeeEntity) {
        return new EmployeeDto(
                employeeEntity.getId(),
                employeeEntity.getFirstName(),
                employeeEntity.getLastName(),
                employeeEntity.getEmail(),
                employeeEntity.getGender(),
                employeeEntity.getBirthDate());
    }

    public static EmployeeEntity mapToEmployeeEntity(EmployeeDto employeeDto) {
        return new EmployeeEntity(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getGender(),
                employeeDto.getBirthDate());
    }
}
