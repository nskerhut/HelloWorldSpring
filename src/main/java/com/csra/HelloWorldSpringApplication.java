package com.csra;

import java.util.List;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class HelloWorldSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		HelloWorldModel model  = context.getBean("HelloWorldModel",HelloWorldModel.class);
		model.setValue("HelloWorld from Spring");
		
		System.out.println(model.getValue());
		
		System.out.println(context.getBean("HelloWorld",HelloWorldModel.class).getValue());
		
		
		System.out.println(context.getBean("HelloWorldProperty",HelloWorldModel.class).getValue());
		
		List<String> list = context.getBean("HelloWorldSet",HelloWorldSet.class).getHelloWorlds();
		for(String item : list){
			System.out.println(item);
		}
		
		System.out.println(context.getBean("HelloWorldPNamespace",HelloWorldModel.class).getValue());
	
		System.out.println(context.getBean("HelloWorldPropFile",HelloWorldModel.class).getValue());
		
		System.out.println(context.getBean("HelloWorldOuter",HelloWorldSet.class).getHelloWorldModel().getValue());
		
		((FileSystemXmlApplicationContext)context).close();
		//SpringApplication.run(HelloWorldSpringApplication.class, args);
	}
}
