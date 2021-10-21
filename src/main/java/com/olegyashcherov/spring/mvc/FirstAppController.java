package com.olegyashcherov.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class FirstAppController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first_view";
    }

//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask_emp_details_view";
//    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        Employee employee = new Employee();
//        employee.setName("Oleg");
//        employee.setSurname("Yashcherov");
        employee.setSalary(15000);
        model.addAttribute("employee", employee);
//        model.addAttribute("employee", new Employee());
        return "ask_emp_details_view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show_emp_details_view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        name = "Mr. " + name;
//        model.addAttribute("nameAttribute", name);
//        return "show_emp_details_view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//        return "show_emp_details_view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
//        employee.setName("Mr. " + employee.getName());
//        employee.setSalary(employee.getSalary()*10);
//        System.out.println(employee.getName().length());
//        System.out.println(employee.getSurname().length());
        if (bindingResult.hasErrors()) {
            return "ask_emp_details_view";
        } else {
            return "show_emp_details_view";
        }
    }
}
