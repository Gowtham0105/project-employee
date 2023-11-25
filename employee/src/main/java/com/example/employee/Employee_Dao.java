package com.example.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Employee_Dao {
	@Autowired
	Employee_Repo emprepo;
	public String addEmployee(Employee_Entity e) {
		emprepo.save(e);
		return "Successfully saved";
	}
	
	public String addEmployees(List<Employee_Entity> le) {
		emprepo.saveAll(le);
		return "Successfully added";
	}
	
	public List<Employee_Entity> getEmployees(){
		return emprepo.findAll();
	}
	
	public Employee_Entity getEmployee(int id) {
		return emprepo.findById(id).get();
	}
	
	public String update (Employee_Entity up) {
		emprepo.save(up);
		return "updated";
	}
	
	public String delete(int id) {
		emprepo.deleteById(id);
		return "Deleted";
	
	}


}
