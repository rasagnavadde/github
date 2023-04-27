package com.dailycodebuffer.Spring.boot.tutorial.service;

import com.dailycodebuffer.Spring.boot.tutorial.entity.Department;
import com.dailycodebuffer.Spring.boot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
