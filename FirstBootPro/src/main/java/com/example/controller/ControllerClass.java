package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Modal;
import com.example.demo.repository.ModalRepository;


@RestController
public class ControllerClass {
	@Autowired
    private ModalRepository modelRepository;
	@GetMapping("/try")
	public List<Modal> data() {
		return modelRepository.findAll();
	}
	
    @PostMapping("/users")
    public Modal createUser(@Valid @RequestBody Modal user) {
    	System.out.println(user);
        return modelRepository.save(user);
    }


}

