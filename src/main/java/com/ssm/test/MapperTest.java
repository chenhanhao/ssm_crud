package com.ssm.test;

import com.ssm.dao.DepartmentMapper;
import com.ssm.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试dao层工作
 * 推荐spring项目就可以使用spring的单元测试，可以自动注入我们需要的组件
 * 1,导入springTest模块
 * 2,@ContextConfiguration指定Spring配置文件的位置
 * 3,直接autowired
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    /**
     * 测试mapper
     * @throws Exception
     */

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;//得到批量的sqlSession

      @Test
      public void test1() throws Exception{
         //1,插入几个部门
//          departmentMapper.insertSelective(new Department(null,"开发部"));
//          departmentMapper.insertSelective(new Department(null,"研发部"));

          //2，生成员工数据员工
       //  employeeMapper.insertSelective(new Employee(null,"jerry","M","JEekdnkew",1));

         //3,批量插入多个员工，使用可以执行批量操作的sqlSession
//          EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//          for (int i = 0; i<1000;i++){
//             String uid =  UUID.randomUUID().toString().substring(0,5)+""+i;
//              mapper.insertSelective(new Employee(null,uid,"M",uid+"@GDUF",1));
//          }

     }
}
