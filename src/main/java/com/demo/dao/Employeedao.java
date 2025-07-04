package com.demo.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employeeentity;
import com.demo.repository.Employeerepository;

@Repository
public class Employeedao {
	
@Autowired
Employeerepository ed;

public String name(List<Employeeentity> e) {
	ed.saveAll(e);
	return "savedsuccessfully";
}

public List<Employeeentity> getemployee() {
	// TODO Auto-generated method stub
	return ed.findAll();
}

public Employeeentity emp(int n) {
	// TODO Auto-generated method stub
	return ed.findById(n).orElse(null);
}

public String emp1(int m) {
	// TODO Auto-generated method stub
	ed.deleteById(m);
	return "deleted";
}

public String emp2(int k, Employeeentity t) {
	// TODO Auto-generated method stub
	Employeeentity e1 =ed.findById(k).get();
	e1.setName(t.getName());
	e1.setSalary(t.getSalary());
	ed.save(e1);
	return "updated Successfully";
}

public String emp3(int l, Employeeentity h) {
	// TODO Auto-generated method stub
	Employeeentity e2=ed.findById(l).get();
	e2.setName(h.getName());
	ed.save(e2);
	return "created";
}
}