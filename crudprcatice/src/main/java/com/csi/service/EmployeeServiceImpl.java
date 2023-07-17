package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepo;
    public Employee saveData(Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee>getAllData(){
        return employeeRepo.findAll();
    }
    public Optional<Employee> getDataByID(int empId){
        return employeeRepo.findById(empId);
    }

    public Employee updateData(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteDataById(int empId){
         employeeRepo.deleteById(empId);
    }
}
