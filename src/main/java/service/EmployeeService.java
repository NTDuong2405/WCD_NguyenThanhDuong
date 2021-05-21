package service;

import entity.Employee;
import repository.GenericRepository;

import java.util.List;

public class EmployeeService {
    private GenericRepository<Employee> studentRepository;
    java.util.Date date=new java.util.Date();
    java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());

    public EmployeeService() {
        this.studentRepository = new GenericRepository<>(Employee.class);
    }

    public boolean create(Employee obj) {
        obj.setCreatedAt(sqlTime);
        return studentRepository.save(obj);
    }

    public List<Employee> getList() {
        return studentRepository.findAll();
    }


}
