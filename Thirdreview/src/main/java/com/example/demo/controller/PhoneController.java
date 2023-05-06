package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Phone;
import com.example.demo.service.PhoneService;

@RestController
public class PhoneController {
	@Autowired
	private PhoneService phoneservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Phone student)
	{
		phoneservice.Post(student);
		return "Successfully Added";
	}
	@PutMapping("/update")
	public String update(@RequestBody Phone student)
	{
		phoneservice.Update(student);
		return "Successfully Updated";
	}
	@GetMapping("/get")
	public List<Phone> getAll()
	{
		return phoneservice.getAll();
	}
	@DeleteMapping("/delete/{rollno}")
	public void Delete(@PathVariable int rollno)
	{
		phoneservice.Delete(rollno);
	}
	@GetMapping("/query/get")
	public List<Phone> get()
	{
		return phoneservice.get();
	}
	



}
