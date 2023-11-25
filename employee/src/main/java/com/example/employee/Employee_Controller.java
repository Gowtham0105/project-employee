package com.example.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/work")

public class Employee_Controller {
	
	@Autowired
	Employee_Service empser;
	@PostMapping(value="/add")
	public String addEmployee(@RequestBody Employee_Entity e) {
		return empser.addEmployee(e);
	}
	@PostMapping(value="/addlist")
	public String addEmployees(@RequestBody List<Employee_Entity> le) {
		return empser.addEmployees(le);
	}
	
	@GetMapping(value="/getlist")
	public List<Employee_Entity> getEmployees(){
		return empser.getEmployees();
	}
	@GetMapping(value="/getid/{id}")
	public Employee_Entity getEmployee(@PathVariable int id) {
		return empser.getEmployee(id);
	}
	@PutMapping(value="/update/{up}")
	public String update (@RequestBody Employee_Entity up) {
		return empser.update(up);
	}
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		return empser.delete(id);
	}
	@GetMapping(value="/login/{id}/{name}")
	public String login(@PathVariable int id,@PathVariable String name) {
		return empser.login(id,name);
	}
 

}


