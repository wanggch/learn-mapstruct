package com.yitong.learn.mapstruct.simple.mapper;

import com.yitong.learn.mapstruct.simple.dto.EmployeeDTO;
import com.yitong.learn.mapstruct.simple.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

public class EmployeeMapperTest {

    private EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void testPo2dto() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("EmployeeName");
        EmployeeDTO dto = employeeMapper.po2dto(employee);
        Assert.assertEquals(employee.getId(), dto.getEmployeeId());
        Assert.assertEquals(employee.getName(), dto.getEmployeeName());
    }

    @Test
    public void testDto2po() {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(1);
        dto.setEmployeeName("EmployeeName");
        Employee employee = employeeMapper.dto2po(dto);
        Assert.assertEquals(employee.getId(), dto.getEmployeeId());
        Assert.assertEquals(employee.getName(), dto.getEmployeeName());
    }
}
