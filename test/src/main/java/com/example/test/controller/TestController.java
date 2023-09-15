package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Test;
import com.example.test.repo.TestRepo;

@RestController
public class TestController {

	@Autowired
	TestRepo testRepo;
	
	@PostMapping("/savetest")
	public Test saveTest(@RequestBody Test test) {
		return testRepo.save(test);
	}
	
	@GetMapping("/gettest")
	public List<Test> findAllTest(){
		return testRepo.findAll();
	}
	
	
	@GetMapping("/gettest/{id}")
	public Optional<Test> getTestById(@PathVariable int id){
		return testRepo.findById(id);
	}
	
	@PutMapping("/updatetest")
	public Test updateTest(@RequestBody Test test) {
		return testRepo.save(test);
	}
	

	@DeleteMapping("/deletetest/{id}")
	public int deleteTest(@PathVariable int id)
	{
		testRepo.deleteById(id);
		return id;
	}
	
}
