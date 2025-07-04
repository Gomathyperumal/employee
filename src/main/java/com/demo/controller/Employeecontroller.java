package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employeeentity;
import com.demo.service.Employeeservice;

@RestController
@RequestMapping(value="/employee")
public class Employeecontroller {
	@Autowired
	Employeeservice  es;
	@PostMapping(value="/employee1")
	public String getemployee(@RequestBody List<Employeeentity> e) {
		return es.getemployee(e);
	}
	@GetMapping(value="/employee2")
	public List<Employeeentity> name(){
	return es.getemployee();
	}
	@GetMapping(value="/employee3/{n}")
	public Employeeentity emp(@PathVariable int n) {
		return es.emp(n);
	}
	@DeleteMapping(value="/employee4/{m}")
	public String emp1(@PathVariable int m) {
		return es.emp1(m);
	}
	@PutMapping(value="/update/{k}")
	public String emp2(@PathVariable int k,@RequestBody Employeeentity t) {
		return es.emp2(k,t);	
	}
	@PatchMapping(value="/change/{l}")
	public String emp3(@PathVariable int l,
			@RequestBody Employeeentity h) {
	return es.emp3(l,h);
	}
	
	
	@GetMapping("/git")
	public String get1() {
		return "saved";		
	}
	@GetMapping("/git1")
	public String get2() {
		return "success";
	}
	
	@GetMapping("/git3")
	public String get3() {
		return "responsed";
	}
}