package sstu.crud_plus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sstu.crud_plus.DAO.EmployeeRepository;
import sstu.crud_plus.Entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElseThrow(() -> new RuntimeException("Employee not found"));
    }


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }



    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
}
