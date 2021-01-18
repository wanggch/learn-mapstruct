package com.yitong.learn.mapstruct.simple.mapper;

import com.yitong.learn.mapstruct.simple.dto.EmployeeDTO;
import com.yitong.learn.mapstruct.simple.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target = "employeeId", source = "po.id"),
            @Mapping(target = "employeeName", source = "po.name")
    })
    EmployeeDTO po2dto(Employee po);
    @Mappings({
            @Mapping(target = "id", source = "dto.employeeId"),
            @Mapping(target = "name", source = "dto.employeeName")
    })
    Employee dto2po(EmployeeDTO dto);
}
