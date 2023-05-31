package com.example.springForm.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

	@Override
	public double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	@Override
	public double circlePerimeter(double radius) {
		return Math.PI * radius * 2;
	}
}
