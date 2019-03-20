package org.lhx.MyBatis.dao;

import org.lhx.MyBatis.bean.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);
}
