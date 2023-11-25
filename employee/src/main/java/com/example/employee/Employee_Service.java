package com.example.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class Employee_Service {
	@Autowired
	Employee_Dao empdao;
	public String addEmployee(Employee_Entity e) {
		return empdao.addEmployee(e);
	}
	
	public String addEmployees(List<Employee_Entity > le) {
		return empdao.addEmployees(le);
		
	}
	
	public List<Employee_Entity> getEmployees(){
		return empdao.getEmployees();
	}
	
	public Employee_Entity getEmployee(int id) {
		return empdao.getEmployee(id);
	}
	
	public String update (Employee_Entity up) {
		return empdao.update(up);
	}
	
	public String delete(int id) {
		return empdao.delete(id);
	}
	public static void main(String[] args) {
		
	}
	
	public String login(@PathVariable int id,@PathVariable String name) {
		int id1=1;
		String name1="gowtham";
		List<Employee_Entity> emps=empdao.getEmployees();
		for(Employee_Entity x:emps) {
			if(x.getId()==id1&&x.getName().equals(name1)) {
				
			}
		}
		return "login successfully";
			}
}
