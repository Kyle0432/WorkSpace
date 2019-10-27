package com.kyle.ssh.service;

import java.util.List;

import com.kyle.ssh.dao.DepartmentDao;
import com.kyle.ssh.entities.Department;

public class DepartmentService {

	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public List<Department> getAll(){
		return departmentDao.getAll();
	}
}
