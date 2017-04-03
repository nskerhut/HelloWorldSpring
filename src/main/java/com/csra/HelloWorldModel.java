package com.csra;

public class HelloWorldModel {
	private String value;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	public HelloWorldModel() {
		
	}
	public HelloWorldModel(String value){
		this.value = value; 
	}
	
	public void initMethod(){
		System.out.println("init");
	}
	public void destroyMethod(){
		System.out.println("destroy");
	}
}
