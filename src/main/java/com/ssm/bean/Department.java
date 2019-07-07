package com.ssm.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Integer deptId;

    private String deptName;

    public Department() {

    }

    /**
     * 生成了有参构造器，一般也要生成无参构造器
     */

    public Department(Integer deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}