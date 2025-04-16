package sstu.crud_plus.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sstu.crud_plus.Entity.Employee;
import sstu.crud_plus.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);

        return "list-employees";
    }

    @GetMapping("addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees/list";
    }


    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees/list";
    }

    @GetMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("id") int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees/list";
    }

}
