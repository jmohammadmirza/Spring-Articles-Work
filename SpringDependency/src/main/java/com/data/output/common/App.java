package com.data.output.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.data.output.OutputHelper;

/* Main Class to run the App
 * Make changes in SpringBeans.xml and run the App 
 * Author :Mohammad Javed
 * */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
	}
}