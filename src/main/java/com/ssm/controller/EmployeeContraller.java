package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Employee;
import com.ssm.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 处理员工CRUD请求
 */
@Controller
public class EmployeeContraller {

    @Autowired
    EmployeService employeService;




    /**
     * 查询员工数据(分页查询)
     * @return
     */
    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value="pn",defaultValue = "1")Integer pn, Model model){

        //会查出1000条，做分页
        //引入PageHelper
        //在查询之前只需调用,传入页码，以及每页大小
        PageHelper.startPage(pn,5);
        //starPage后面紧跟的这个查询就是一个分页查询
        List<Employee> emps = employeService.getAll();

        //使用pageInfo包装查询后的结果，只需将pageInfo交给页面就行了
        //封装了详细的分页详细，包括我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);

        return "list";
    }
}
