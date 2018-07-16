package com.lyj.dao;

import com.lyj.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
    public List<Employee> getEmps();



}