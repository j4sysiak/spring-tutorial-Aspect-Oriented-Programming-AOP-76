package com.jaceksysiak.spring.aop;

public class Camera {
	
	public void snap(){
		
		System.out.println("SNAP!");
	}

	@Override
	public String toString() {
		return "Camera []";
	}
	
	

}
