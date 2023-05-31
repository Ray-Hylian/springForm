package com.example.springForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springForm.DTO.RadiusDTO;
import com.example.springForm.service.MathService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MathController {

	@Autowired
	private MathService mathService;

	@PostMapping(value = "/circleArea")
	public ResponseEntity<Object> calculCircleArea(@RequestBody RadiusDTO radiusDTO) {
		return new ResponseEntity<>(mathService.circleArea(radiusDTO.getRadius()), HttpStatus.OK);
	}
	
	@PostMapping(value = "/circlePerimeter")
	public ResponseEntity<Object> calculCirclePerimeter(@RequestBody RadiusDTO radiusDTO) {
		return new ResponseEntity<>(mathService.circlePerimeter(radiusDTO.getRadius()), HttpStatus.OK);
	}

}
