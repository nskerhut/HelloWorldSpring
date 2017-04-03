package com.csra;

import java.util.List;

public class HelloWorldSet {
	private List<String> helloWorlds;

	private HelloWorldModel helloWorldModel;
	/**
	 * @return the helloWorlds
	 */
	public List<String> getHelloWorlds() {
		return helloWorlds;
	}

	/**
	 * @param helloWorlds the helloWorlds to set
	 */
	public void setHelloWorlds(List<String> helloWorlds) {
		this.helloWorlds = helloWorlds;
	}

	/**
	 * @return the helloWorldModel
	 */
	public HelloWorldModel getHelloWorldModel() {
		return helloWorldModel;
	}

	/**
	 * @param helloWorldModel the helloWorldModel to set
	 */
	public void setHelloWorldModel(HelloWorldModel helloWorldModel) {
		this.helloWorldModel = helloWorldModel;
	}
	
	public HelloWorldSet() {
		
	}
	public HelloWorldSet(HelloWorldModel myHelloWorldModel){
		this.helloWorldModel = myHelloWorldModel;
	}
}
