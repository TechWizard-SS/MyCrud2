package sstu.crud_plus.Service;

import sstu.crud_plus.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteEmployeeById(int id);

}
