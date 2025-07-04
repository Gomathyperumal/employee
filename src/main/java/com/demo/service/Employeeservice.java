package com.demo.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.dao.Employeedao;
import com.demo.entity.Employeeentity;

@Service
public class Employeeservice {
@Autowired
Employeedao et;

@Autowired
RestTemplate rt;


public String getemployee(List<Employeeentity> e) {
return et.name(e);
}
public List<Employeeentity> getemployee() {
	// TODO Auto-generated method stub
	return et.getemployee();
}
public Employeeentity emp(int n) {
	// TODO Auto-generated method stub
	return et.emp(n);
}
public String emp1(int m) {
	// TODO Auto-generated method stub
	return et.emp1(m);
}
public String emp2(int k, Employeeentity t) {
	// TODO Auto-generated method stub
	return et.emp2(k,t);
}
public String emp3(int l, Employeeentity h) {
	// TODO Auto-generated method stub
	return et.emp3(l,h);
}

}