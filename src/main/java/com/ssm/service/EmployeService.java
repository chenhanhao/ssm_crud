package com.ssm.service;

import com.ssm.bean.Employee;
import com.ssm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
     @Autowired
     EmployeeMapper employeeMapper;

    /**
     * 查询所有员工
     * @return
     */
     public List<Employee> getAll(){

       return employeeMapper.selectByExampleWithDept(null);

     }
}
