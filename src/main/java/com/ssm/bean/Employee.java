package com.ssm.bean;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer dId;

    //希望查询员工的同时，部门信息也是查询好的
    private Department department;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                ", department=" + department +
                '}';
    }
}