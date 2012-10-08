package org.springsource.samples.federation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PubSub {

	public static void main(String[] args) {
		AbstractApplicationContext ctxt = 
			new ClassPathXmlApplicationContext("classpath:META-INF/spring/*-context.xml");
		ctxt.registerShutdownHook();
	}

}
