package com.yitong.learn.mapstruct.simple.mapper;

import com.yitong.learn.mapstruct.simple.dto.EmployeeDTO;
import com.yitong.learn.mapstruct.simple.entity.Employee;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-06T11:34:02+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO po2dto(Employee po) {
        if ( po == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeId( po.getId() );
        employeeDTO.setEmployeeName( po.getName() );

        return employeeDTO;
    }

    @Override
    public Employee dto2po(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( dto.getEmployeeId() );
        employee.setName( dto.getEmployeeName() );

        return employee;
    }
}
