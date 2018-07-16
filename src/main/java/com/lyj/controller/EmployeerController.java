package com.lyj.controller;

import com.lyj.Service.EmployeeService;
import com.lyj.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class EmployeerController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("getEmps")
    public String emps(Map<String,Object> map)
    {
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps",emps);
        return "list";
    }
}
